package com.sxl.controller.admin;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxl.controller.MyController;
import com.sxl.util.StringHelper;

@Controller("frontController")
@RequestMapping(value = "/front")
public class FrontController extends MyController {

	@RequestMapping(value = "/index")
	public String frame(Model model, HttpServletRequest request)
			throws Exception {
		String sql = "select a.* from t_product a where 1=1 order by id desc limit 4";
		List list = db.queryForList(sql);
		System.out.println(list);
		request.setAttribute("list", list);
		
		
		
		//随机推荐4个
		
		sql = "select a.* from t_product a where 1=1 ORDER BY RAND() LIMIT 4";
		List list2 = db.queryForList(sql);
		request.setAttribute("list2", list2);
		
		
		sql = "select * from t_lbt";
		List list3 = db.queryForList(sql);
		request.setAttribute("list3", list3);
		
		return "/front/index";
	}

	@RequestMapping(value = "/login")
	public String login(Model model, HttpServletRequest request)
			throws Exception {
		return "/front/login";
	}
	
	@RequestMapping(value = "/all")
	public String all(Model model, HttpServletRequest request,Long typesId,String productName)
			throws Exception {
		
		String sql="select a.* from t_types a where 1=1";
			sql+=" order by id desc";
			List typesList = db.queryForList(sql);
			request.setAttribute("typesList", typesList);
			 sql="select a.*,(select typesName from t_types b where a.typesId=b.id) typesName  from t_product a where 1=1";
			 
			 if(typesId!=null&&!"".equals(typesId)){
				 sql+=" and a.typesId="+typesId;
			 }
			 if(productName!=null&&!"".equals(productName)){
				 sql+=" and a.productName like '%"+productName+"%' ";
			 }
				sql+=" order by id desc";
				List list = db.queryForList(sql);
				request.setAttribute("list", list);
		
		return "/front/all";
	}
	
	@RequestMapping(value = "/liuyan")
	public String liuyan(Model model, HttpServletRequest request,Long typesId,String productName)
			throws Exception {
		
		String sql="select * from t_contact where customerId="+getCustomer(request).get("id");
			sql+=" order by id desc";
			List list = db.queryForList(sql);
			request.setAttribute("list", list);
		
		return "/front/liuyan";
	}
	
	@RequestMapping(value = "/jfdh")
	public String jfdh(Model model, HttpServletRequest request)
			throws Exception {
		
		String sql="select a.* from t_jfdh a where 1=1";

			sql+=" order by id desc";
			List list = db.queryForList(sql);
			request.setAttribute("list", list);
		return "/front/jfdh";
	}
	@RequestMapping(value = "/dhjfSave")
	public ResponseEntity<String> dhjfSave(Model model,
			HttpServletRequest request,Long id) throws Exception {
		Map map = db.queryForMap("select * from t_jfdh where id="+id);
		String jf = map.get("jfCost").toString();
		String jfName = map.get("jfName").toString();
		//订单
		String sql = "insert into t_order(orderNum,customerId,productDetail,allPrice,status,insertDate) values(?,?,?,?,?,now())";
		int result = db.update(sql, new Object[] { System.currentTimeMillis()+"",
				getCustomer(request).get("id").toString(), jfName+"积分兑换["+jf+"]", 0+"", "兑换完成" });
		sql="update t_customer set jf = jf-"+jf+" where id="+getCustomer(request).get("id");
		db.update(sql);
		
		//积分减少
		return renderData(true, "操作成功", null);
	}
	

	@RequestMapping(value = "/register")
	public String register(Model model, HttpServletRequest request)
			throws Exception {
		System.out.println("112312312");
		return "/front/register";
	}

	@RequestMapping(value = "/detail")
	public String detail(Model model, HttpServletRequest request, Long id)
			throws Exception {
		
		String sql = "select a.*,(select typesName from t_types b where a.typesId=b.id) typesName from t_product a where id=" + id;
		Map map = db.queryForMap(sql);
		request.setAttribute("map", map);
		
		
		sql = "select a.* from t_product a where 1=1 ORDER BY RAND() LIMIT 4";
		List list2 = db.queryForList(sql);
		request.setAttribute("list2", list2);
		return "/front/detail";
	}

	@RequestMapping(value = "/myOrder")
	public String myOrder(Model model, HttpServletRequest request)
			throws Exception {
		String sql = "select a.*,(select max(customerName) from t_customer b where a.customerId=b.id) customerName  from t_order a where 1=1 ";

		if (1 == 1) {
			sql += "and customerId=" + getCustomer(request).get("id") + " ";
		}
		sql += " order by id desc";
		List list = db.queryForList(sql);
		request.setAttribute("orderList", list);
		return "/front/myOrder";
	}
	
	
	@RequestMapping(value = "/deleteOneOrder")
	public ResponseEntity<String> deleteOneOrder(Model model,
			HttpServletRequest request,Long id) throws Exception {
		String sql="delete from t_order where id="+id;
		db.update(sql);
		return renderData(true, "操作成功", null);
	}


	@RequestMapping(value = "/addShopcar")
	public ResponseEntity<String> addShopcar(Model model,
			HttpServletRequest request, Long id, Integer num) throws Exception {
		int result = 0;
		// 判断该用户是否
		String sql = "select * from t_shopcar where  productId=? and customerId=?";
		Map map = db.queryForMap(sql, new Object[] { id.toString(),
				getCustomer(request).get("id").toString() });
		if (map != null && map.size() > 0) {
			sql = "update t_shopcar set productId=?,num=num+" + num
					+ " where id=?";
			result = db.update(sql, new Object[] { id, map.get("id") });
		} else {
			sql = "insert into t_shopcar(productId,num,customerId) values(?,?,?)";
			result = db.update(sql, new Object[] { id, num,
					getCustomer(request).get("id").toString() });
		}
		if (result == 1) {
			return renderData(true, "操作成功", null);
		} else {
			return renderData(false, "操作失败", null);
		}
	}

	@RequestMapping(value = "/checkIsLogin")
	public ResponseEntity<String> checkIsLogin(Model model,
			HttpServletRequest request) throws Exception {
		Map customer = getCustomer(request);
		if (customer != null && customer.size() > 0) {
			return renderData(true, "操作成功", null);
		} else {
			return renderData(false, "操作失败", null);
		}
	}

	@RequestMapping(value = "/pay")
	public ResponseEntity<String> pay(Model model, HttpServletRequest request,Long shdzId)
			throws Exception {
		String sql = "select a.*,(select productName from t_product b where a.productId=b.id) productName,"
				+ "(select price from t_product b where a.productId=b.id) price,(select jf from t_product b where a.productId=b.id) jf  from t_shopcar a where customerId="
				+ getCustomer(request).get("id");
		sql += " order by id desc";
		List<Map> list = db.queryForList(sql);
		int total = 0;
		int jf = 0;
		String productDetail = "";
		for (int i = 0; i < list.size(); i++) {
			productDetail += "," + list.get(i).get("productName") + "["
					+ list.get(i).get("num") + "]";
			total += Integer.parseInt(list.get(i).get("price").toString())
					* Integer.parseInt(list.get(i).get("num").toString());
			
//			jf+=Integer.parseInt(list.get(i).get("jf").toString())
//					* Integer.parseInt(list.get(i).get("num").toString());
			
			String sql2="update t_product set nums=nums-"+list.get(i).get("num").toString()+" where id="+list.get(i).get("productId").toString();
			db.update(sql2);
		}
		total+=20;
		sql = "insert into t_order(orderNum,customerId,productDetail,allPrice,status,insertDate,v1,v2,v3,v4,lxr,lxdh) values(?,?,?,?,?,now(),?,?,?,?,?,?)";
		String orderNum = System.currentTimeMillis()+"";
		Map shdz = db.queryForMap("select * from t_shdz where id=?",new Object[]{shdzId});
		System.out.println("shdz===="+shdz);
		int result = db.update(sql, new Object[] {orderNum,
				getCustomer(request).get("id").toString(), productDetail.subSequence(1, productDetail.length()), total+"", "等待处理" ,shdz.get("province").toString(),
				shdz.get("city").toString(),shdz.get("area").toString(),shdz.get("address").toString(),shdz.get("lxr").toString(),shdz.get("lxdh").toString()});
		
		
		String dlist = "insert into t_orderlist(orderNum,productId,num) values(?,?,?)";
		for (int i = 0; i < list.size(); i++) {
			db.update(dlist, new Object[]{orderNum,list.get(i).get("productId").toString(),list.get(i).get("num").toString()});
		}

		sql = "delete from t_shopcar where customerId="
				+ getCustomer(request).get("id");
		db.update(sql);
		
		sql="update t_customer set jf = jf+"+jf+",account=account-"+total +" where id="+getCustomer(request).get("id");
		db.update(sql);
		
		
		
		

		if (result == 1) {
			return renderData(true, "操作成功", null);
		} else {
			return renderData(false, "操作失败", null);
		}
	}

	@RequestMapping(value = "/shopcar")
	public String shopcar(Model model, HttpServletRequest request)
			throws Exception {
		
		Map customer = getCustomer(request);
		if (customer != null && customer.size() > 0) {
		} else {
			return "redirect:/front/register.html";
		}
		
		
		String sql = "select b.*,a.id ids,a.num num   from t_shopcar a left join t_product b on a.productId=b.id  where 1=1 and customerId="
				+ getCustomer(request).get("id");
		sql += " order by id desc";
		System.out.println(sql);
		List<Map> list = db.queryForList(sql);
		request.setAttribute("list", list);
		System.out.println(list);
		int total = 0;
		if(list!=null&&list.size()>0){
			for (int i = 0; i < list.size(); i++) {
				total += Integer.parseInt(list.get(i).get("price").toString())
						* Integer.parseInt(list.get(i).get("num").toString());
			}
		}
		
		request.setAttribute("total", total);
		
		
		String sql2="select * from t_shdz where customerId=?";
		List<Map> shdzList = db.queryForList(sql2,new Object[]{getCustomer(request).get("id")});
		model.addAttribute("shdzList", shdzList);
		return "/front/shopcar";
	}

	@RequestMapping(value = "/save")
	public ResponseEntity<String> loginSave(Model model,
			HttpServletRequest request, String username, String password)
			throws Exception {
		String sql = "select * from t_customer where username=?";
		List<Map> list = db.queryForList(sql, new Object[] { username });
		String result = "1";
		if (list != null && list.size() > 0) {
			Map map = list.get(0);
			if (StringHelper.get(map, "password").equals(password)) {
				request.getSession().setMaxInactiveInterval(60 * 60 * 24);
				request.getSession().setAttribute("customerBean", map);
				result = "1";
			} else {
				result = "0";
			}
		} else {
			result = "0";
		}
		return renderData(true, result, null);
	}
	
	
	@RequestMapping(value = "/deleteOneShopCar")
	public ResponseEntity<String> deleteOneShopCar(Model model,
			HttpServletRequest request,Long id)
			throws Exception {
		String sql="delete from t_shopcar where id="+id;
		db.update(sql);
		return renderData(true, "", null);
	}
	
	@RequestMapping(value = "/qkgwc")
	public ResponseEntity<String> qkgwc(Model model,
			HttpServletRequest request,Long id)
			throws Exception {
		String sql="delete from t_shopcar where customerId="+getCustomer(request).get("id");
		db.update(sql);
		return renderData(true, "", null);
	}
	
	
	@RequestMapping(value = "/updateShopCar")
	public ResponseEntity<String> updateShopCar(Model model,
			HttpServletRequest request,Long id,Integer num)
			throws Exception {
		String sql="update t_shopcar set num="+num+" where id="+id;
		System.out.println(sql);
		db.update(sql);
		return renderData(true, "", null);
	}

	@RequestMapping(value = "/registerSave")
	public ResponseEntity<String> registerSave(Model model,
			HttpServletRequest request, Long id, String username,
			String password, String customerName, String sex, String address,
			String phone) throws Exception {
		int result = 0;
		String sql = "insert into t_customer(username,password,customerName,sex,address,phone) values(?,?,?,?,?,?)";
		result = db.update(sql, new Object[] { username, password, customerName, sex,
				address, phone });
		sql = "select * from t_customer order by id desc limit 1";
		List<Map> list = db.queryForList(sql);
		request.getSession().setMaxInactiveInterval(60 * 60 * 24);
		request.getSession().setAttribute("customerBean", list.get(0));

		return renderData(true, "操作成功", null);
	}

	@RequestMapping(value = "/out")
	public String out(Model model, HttpServletRequest request) throws Exception {
		request.getSession().removeAttribute("customerBean");
		return "redirect:/front/register.html";
	}

	@RequestMapping(value = "/mine")
	public String mine(Model model, HttpServletRequest request)
			throws Exception {
		Map customer = getCustomer(request);
		Map map = db.queryForMap("select * from t_customer where id=?",
				new Object[] { customer.get("id") });
		model.addAttribute("customer", map);
		return "/front/mine";
	}

	@RequestMapping(value = "/mineSave")
	public ResponseEntity<String> mineSave(Model model,
			HttpServletRequest request, Long id, String username,
			String password, String customerName, String sex, String address,
			String phone) throws Exception {
		int result = 0;
		String sql = "update t_customer set customerName=?,sex=?,address=?,phone=? where id=?";
		result = db
				.update(sql, new Object[] { customerName, sex, address, phone, id });
		if (result == 1) {
			return renderData(true, "操作成功", null);
		} else {
			return renderData(false, "操作失败", null);
		}
	}

	@RequestMapping(value = "/password")
	public String password(Model model, HttpServletRequest request)
			throws Exception {
		return "/front/password";
	}

	@RequestMapping(value = "/changePassword")
	public ResponseEntity<String> changePassword(Model model,
			HttpServletRequest request, String oldPassword, String newPassword)
			throws Exception {
		Map customer = getCustomer(request);
		if (oldPassword.equals(customer.get("password").toString())) {
			String sql = "update t_customer set password=? where id=?";
			db.update(sql, new Object[] { newPassword, customer.get("id") });
			return renderData(true, "1", null);
		} else {
			return renderData(false, "1", null);
		}
	}

	@RequestMapping(value = "/plSave")
	public ResponseEntity<String> plSave(Model model,
			HttpServletRequest request, Long id, String pl) throws Exception {
		int result = 0;
		String sql = "update t_order set pl=? where id=?";
		result = db.update(sql, new Object[] { pl, id });
		if (result == 1) {
			return renderData(true, "操作成功", null);
		} else {
			return renderData(false, "操作失败", null);
		}
	}

	@RequestMapping(value = "/contact")
	public String fk(Model model, HttpServletRequest request) throws Exception {
		return "/front/contact";
	}

	@RequestMapping(value = "/contactSave")
	public ResponseEntity<String> contactSave(Model model,
			HttpServletRequest request, String content, String phone)
			throws Exception {
		int result = 0;
		String sql = "insert into t_contact(customerId,phone,content,insertDate) values(?,?,?,now())";
		result = db.update(sql, new Object[] { getCustomer(request).get("id"),
				phone, content });
		if (result == 1) {
			return renderData(true, "操作成功", null);
		} else {
			return renderData(false, "操作失败", null);
		}
	}

	@RequestMapping(value = "/message")
	public String message(Model model, HttpServletRequest request)
			throws Exception {

		String sql = "select a.*,(select max(name) from t_customer b where a.customerId=b.id) customerName  from t_message a where 1=1 ";
		sql += " and customerId=" + getCustomer(request).get("id") + " ";
		sql += " order by id desc";
		List list = db.queryForList(sql);
		request.setAttribute("list", list);
		System.out.println(list);
		return "/front/message";
	}

	@RequestMapping(value = "/saveMessageContent")
	public ResponseEntity<String> saveMessageContent(Model model,
			HttpServletRequest request, String messageContent) throws Exception {
		Map customer = getCustomer(request);

		String sql = "insert into t_message(customerId,messageContent,insertDate,types) values(?,?,now(),1)";//1代表我
		int result = db
				.update(sql, new Object[] { getCustomer(request).get("id"),
						messageContent });
		return renderData(true, "1", null);
	}
	
	///前端增删改查例子开始//////////////////////////////////////////////////////////////////////
	@RequestMapping(value = "/test")
	public String test(Model model, HttpServletRequest request,String flag,String testName)throws Exception {
		String sql="select a.*,(select max(name) from t_customer b where a.customerId=b.id) customerName  from t_test a where 1=1";
		if(testName!=null&&!"".equals(testName)){
			sql+=" and testName like '%"+testName+"%' ";
		}
		sql+="  and customerId="+getCustomer(request).get("id");
		sql+=" order by id desc";
		List list = db.queryForList(sql);
		request.setAttribute("list", list);
		return "/front/test";
	}
	
	@RequestMapping(value = "/testaddSave")
	public ResponseEntity<String> testaddSave(Model model,HttpServletRequest request,Long id,String flag
		,Integer customerId,String testName,String testContent,String testSex,String testDay,String testPic,String insertDate) throws Exception{
		int result = 0;
		if(id!=null){
			String sql="update t_test set testName=?,testContent=?,testSex=?,testDay=?,testPic=? where id=?";
			result = db.update(sql, new Object[]{testName,testContent,testSex,testDay,testPic,id});
		}else{
			String sql="insert into t_test(customerId,testName,testContent,testSex,testDay,testPic,insertDate) values(?,?,?,?,?,?,now())";
			result = db.update(sql, new Object[]{getCustomer(request).get("id"),testName,testContent,testSex,testDay,testPic});
		}
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
	}
	
	@RequestMapping(value = "/testDelete")
	public ResponseEntity<String> testDelete(Model model,HttpServletRequest request,Long id,String flag) throws Exception {
		
		String sql="delete from t_test where id=?";
		int result = db.update(sql, new Object[]{id});
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
		
	}
	
	@RequestMapping(value = "/testadd")
	public String testadd(Model model, HttpServletRequest request,Long id,String flag)throws Exception {
		if(id!=null){
			//修改
			String sql="select * from t_test where id=?";
			Map map = db.queryForMap(sql,new Object[]{id});
			model.addAttribute("map", map);
		}String sql="";
		return "/front/testadd";
	}
	
	
	
	///前端增删改查例子结束/////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/find")
	public String find(Model model, HttpServletRequest request)
			throws Exception {
		return "/front/find";
	}
	
	
	@RequestMapping(value = "/findSave")
	public ResponseEntity<String> findSave(Model model,
			HttpServletRequest request, String username, String phone)
			throws Exception {
		String sql = "select * from t_customer where username=? and phone=?";
		List<Map> list = db.queryForList(sql, new Object[] { username,phone });
		System.out.println(list);
		String result = "1";
		if (list != null && list.size() > 0) {
			Map map = list.get(0);
			return renderData(true, result, null);
		} else {
			return renderData(false, result, null);
		}
		
	}
	
	@RequestMapping(value = "/findSaveConfirm")
	public ResponseEntity<String> findSaveConfirm(Model model,
			HttpServletRequest request, String username, String phone,String password)
			throws Exception {
		String sql = "update t_customer set password=? where  username=? and phone=?";
		db.update(sql, new Object[] {password, username,phone });
		return renderData(true, "", null);
		
	}
	
	
	@RequestMapping(value = "/wddz")
	public String wddz(Model model, HttpServletRequest request)
			throws Exception {
		String sql="select * from t_shdz where customerId=?";
		List<Map> list = db.queryForList(sql,new Object[]{getCustomer(request).get("id")});
		model.addAttribute("list", list);
		return "/front/wddz";
	}
	
	@RequestMapping(value = "/wddzEdit")
	public String wddzEdit(Model model, HttpServletRequest request,Long id)
			throws Exception {
		if(id!=null){
			//修改
			String sql="select * from t_shdz where id=?";
			Map map = db.queryForMap(sql,new Object[]{id});
			model.addAttribute("map", map);
		}
		return "/front/wddzEdit";
	}
	
	@RequestMapping(value = "/wddzSave")
	public ResponseEntity<String> wddzSave(Model model,HttpServletRequest request,Long id,String province,String city,String area,String address,String lxr,String lxdh) throws Exception{
		int result = 0;
		if(id!=null){
			String sql="update t_shdz set province=?,city=?,area=?,address=?,lxr=?,lxdh=? where id=?";
			result = db.update(sql, new Object[]{province,city,area,address,lxr,lxdh,id});
		}else{
			String sql="insert into t_shdz(customerId,province,city,area,address,lxr,lxdh) values(?,?,?,?,?,?,?)";
			result = db.update(sql, new Object[]{getCustomer(request).get("id"),province,city,area,address,lxr,lxdh});
		}
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
	}
	
	@RequestMapping(value = "/wddzDelete")
	public ResponseEntity<String> wddzDelete(Model model,HttpServletRequest request,Long id,String flag) throws Exception {
		String sql="delete from t_shdz where id=?";
		int result = db.update(sql, new Object[]{id});
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
		
	}
}
