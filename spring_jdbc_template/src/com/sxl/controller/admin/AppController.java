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

@Controller("appController")
@RequestMapping(value = "/app")
public class AppController extends MyController {

	@RequestMapping(value = "/index")
	public String frame(Model model, HttpServletRequest request)
			throws Exception {
		String sql = "select a.* from t_product a where 1=1";
		List list = db.queryForList(sql);
		System.out.println(list);
		request.setAttribute("list", list);
		return "/app/index";
	}

	@RequestMapping(value = "/login")
	public String login(Model model, HttpServletRequest request)
			throws Exception {
		return "/app/login";
	}

	@RequestMapping(value = "/register")
	public String register(Model model, HttpServletRequest request)
			throws Exception {
		System.out.println("112312312");
		return "/app/register";
	}

	@RequestMapping(value = "/detail")
	public String detail(Model model, HttpServletRequest request, Long id)
			throws Exception {
		String sql = "select a.* from t_product a where id=" + id;
		Map map = db.queryForMap(sql);
		request.setAttribute("bean", map);
		return "/app/detail";
	}

	@RequestMapping(value = "/myOrder")
	public String myOrder(Model model, HttpServletRequest request)
			throws Exception {
		String sql = "select a.*,(select max(name) from t_customer b where a.customerId=b.id) name  from t_order a where 1=1 ";

		if (1 == 1) {
			sql += "and customerId=" + getCustomer(request).get("id") + " ";
		}
		sql += " order by id desc";
		List list = db.queryForList(sql);
		request.setAttribute("orderList", list);
		System.out.println("############");
		return "/app/myOrder";
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
	public ResponseEntity<String> pay(Model model, HttpServletRequest request)
			throws Exception {
		String sql = "select a.*,(select productName from t_product b where a.productId=b.id) productName,"
				+ "(select price from t_product b where a.productId=b.id) price  from t_shopcar a where 1=1";
		sql += " order by id desc";
		List<Map> list = db.queryForList(sql);
		int total = 0;
		String productDetail = "";
		for (int i = 0; i < list.size(); i++) {
			productDetail += "," + list.get(i).get("productName") + "["
					+ list.get(i).get("num") + "]";
			total += Integer.parseInt(list.get(i).get("price").toString())
					* Integer.parseInt(list.get(i).get("num").toString());
		}
		sql = "insert into t_order(orderNum,customerId,productDetail,allPrice,status,insertDate) values(?,?,?,?,?,?)";
		int result = db.update(sql, new Object[] { System.currentTimeMillis(),
				getCustomer(request).get("id"), productDetail, total, "等待处理" });

		sql = "delete from t_shopcar where customerId="
				+ getCustomer(request).get("id");
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
		String sql = "select a.*,(select productName from t_product b where a.productId=b.id) productName,"
				+ "(select price from t_product b where a.productId=b.id) price  from t_shopcar a where 1=1 and customerId="
				+ getCustomer(request).get("id");
		sql += " order by id desc";
		List<Map> list = db.queryForList(sql);
		request.setAttribute("list", list);
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += Integer.parseInt(list.get(i).get("price").toString())
					* Integer.parseInt(list.get(i).get("num").toString());
		}
		request.setAttribute("total", total);
		return "/app/shopcar";
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

	@RequestMapping(value = "/registerSave")
	public ResponseEntity<String> registerSave(Model model,
			HttpServletRequest request, Long id, String username,
			String password, String name, String sex, String address,
			String mobile) throws Exception {
		int result = 0;
		String sql = "insert into t_customer(username,password,name,sex,address,mobile) values(?,?,?,?,?,?)";
		result = db.update(sql, new Object[] { username, password, name, sex,
				address, mobile });
		sql = "select * from t_customer order by id desc limit 1";
		List<Map> list = db.queryForList(sql);
		request.getSession().setMaxInactiveInterval(60 * 60 * 24);
		request.getSession().setAttribute("customerBean", list.get(0));

		return renderData(true, "操作成功", null);
	}

	@RequestMapping(value = "/out")
	public String out(Model model, HttpServletRequest request) throws Exception {
		request.getSession().removeAttribute("customerBean");
		return "redirect:/app/login.html";
	}

	@RequestMapping(value = "/mine")
	public String mine(Model model, HttpServletRequest request)
			throws Exception {
		Map customer = getCustomer(request);
		Map map = db.queryForMap("select * from t_customer where id=?",
				new Object[] { customer.get("id") });
		model.addAttribute("bean", map);
		return "/app/mine";
	}

	@RequestMapping(value = "/mineSave")
	public ResponseEntity<String> mineSave(Model model,
			HttpServletRequest request, Long id, String username,
			String password, String name, String sex, String address,
			String mobile) throws Exception {
		int result = 0;
		String sql = "update t_customer set name=?,sex=?,address=?,mobile=? where id=?";
		result = db
				.update(sql, new Object[] { name, sex, address, mobile, id });
		if (result == 1) {
			return renderData(true, "操作成功", null);
		} else {
			return renderData(false, "操作失败", null);
		}
	}

	@RequestMapping(value = "/password")
	public String password(Model model, HttpServletRequest request)
			throws Exception {
		return "/app/password";
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
		return "/app/contact";
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
		return "/app/message";
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
		return "/app/test";
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
		return "/app/testadd";
	}
	
	
	
	///前端增删改查例子结束/////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/doneppIndexApp")
	public String doneppIndexApp(Model model, HttpServletRequest request,String flag,String doneppName)throws Exception {
		String sql="select a.*,(select max(name) from t_customer b where a.customerId=b.id) customerName  from t_donepp a where 1=1";

if(1==2){sql+="and customerId="+getCustomer(request).get("id") +" ";}
	if(doneppName!=null&&!"".equals(doneppName)){
			sql+=" and doneppName like '%"+doneppName+"%'";
		}
		sql+=" order by id desc";
		List list = db.queryForList(sql);
		request.setAttribute("list", list);
		return "/app/doneppIndexApp";
	}
	
	@RequestMapping(value = "/doneppEditSaveApp")
	public ResponseEntity<String> doneppEditSaveApp(Model model,HttpServletRequest request,Long id,String flag
		,String doneppName,String donePic,String sex,String insertDate,String chooseDate,String status,Integer customerId) throws Exception{
		int result = 0;
		if(id!=null){
			String sql="update t_donepp set doneppName=?,donePic=?,sex=?,chooseDate=? where id=?";
			result = db.update(sql, new Object[]{doneppName,donePic,sex,chooseDate,id});
		}else{
			String sql="insert into t_donepp(doneppName,donePic,sex,insertDate,chooseDate,status,customerId) values(?,?,?,now(),?,?,?)";
			result = db.update(sql, new Object[]{doneppName,donePic,sex,chooseDate,"有效",getCustomer(request).get("id")});
		}
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
	}
	
	@RequestMapping(value = "/doneppDeleteApp")
	public ResponseEntity<String> doneppDeleteApp(Model model,HttpServletRequest request,Long id,String flag) throws Exception {
		
		String sql="delete from t_donepp where id=?";
		int result = db.update(sql, new Object[]{id});
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
		
	}
	@RequestMapping(value = "/doneppUpdateColumnstatusApp")
	public ResponseEntity<String> doneppUpdateColumnstatusApp(Model model,HttpServletRequest request,Long id,String status) throws Exception {
		
		String sql="update t_donepp set status=?   where id=?";
		int result = db.update(sql, new Object[]{status,id});
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
		
	}
	
	@RequestMapping(value = "/doneppEditApp")
	public String doneppEditApp(Model model, HttpServletRequest request,Long id,String flag)throws Exception {
		if(id!=null){
			//修改
			String sql="select * from t_donepp where id=?";
			Map map = db.queryForMap(sql,new Object[]{id});
			model.addAttribute("map", map);
		}String sql="";

		return "/app/doneppEditApp";
	}
	
	@RequestMapping(value = "/xiangjiaoIndexApp")
	public String xiangjiaoIndexApp(Model model, HttpServletRequest request,String flag,String xiangjiaoName)throws Exception {
		String sql="select a.*,(select productName from t_product b where a.productId=b.id) productName  from t_xiangjiao a where 1=1";


	if(xiangjiaoName!=null&&!"".equals(xiangjiaoName)){
			sql+=" and xiangjiaoName like '%"+xiangjiaoName+"%'";
		}
		sql+=" order by id desc";
		List list = db.queryForList(sql);
		request.setAttribute("list", list);
		return "/app/xiangjiaoIndexApp";
	}
	
	@RequestMapping(value = "/xiangjiaoEditSaveApp")
	public ResponseEntity<String> xiangjiaoEditSaveApp(Model model,HttpServletRequest request,Long id,String flag
		,String xiangjiaoName,String xiangjiaoPic,String sex,String insertDate,String chooseDate,String status,Integer productId) throws Exception{
		int result = 0;
		if(id!=null){
			String sql="update t_xiangjiao set xiangjiaoName=?,xiangjiaoPic=?,sex=?,chooseDate=?,productId=? where id=?";
			result = db.update(sql, new Object[]{xiangjiaoName,xiangjiaoPic,sex,chooseDate,productId,id});
		}else{
			String sql="insert into t_xiangjiao(xiangjiaoName,xiangjiaoPic,sex,insertDate,chooseDate,status,productId) values(?,?,?,now(),?,?,?)";
			result = db.update(sql, new Object[]{xiangjiaoName,xiangjiaoPic,sex,chooseDate,"有效",productId});
		}
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
	}
	
	@RequestMapping(value = "/xiangjiaoDeleteApp")
	public ResponseEntity<String> xiangjiaoDeleteApp(Model model,HttpServletRequest request,Long id,String flag) throws Exception {
		
		String sql="delete from t_xiangjiao where id=?";
		int result = db.update(sql, new Object[]{id});
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
		
	}
	@RequestMapping(value = "/xiangjiaoUpdateColumnstatusApp")
	public ResponseEntity<String> xiangjiaoUpdateColumnstatusApp(Model model,HttpServletRequest request,Long id,String status) throws Exception {
		
		String sql="update t_xiangjiao set status=?   where id=?";
		int result = db.update(sql, new Object[]{status,id});
		if(result==1){
			return renderData(true,"操作成功",null);
		}else{
			return renderData(false,"操作失败",null);
		}
		
	}
	
	@RequestMapping(value = "/xiangjiaoEditApp")
	public String xiangjiaoEditApp(Model model, HttpServletRequest request,Long id,String flag)throws Exception {
		if(id!=null){
			//修改
			String sql="select * from t_xiangjiao where id=?";
			Map map = db.queryForMap(sql,new Object[]{id});
			model.addAttribute("map", map);
		}String sql="";

 sql="select * from t_product";
model.addAttribute("productList", db.queryForList(sql));

		return "/app/xiangjiaoEditApp";
	}

}
