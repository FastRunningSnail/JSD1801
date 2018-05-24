package com.entor.maventest.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entor.maventest.Dao.UserInfoDao;
import com.entor.maventest.entity.UserInfo;
import com.entor.maventest.util.DBUtil;
import com.entor.maventest.util.PageModel;

public class UserInfoDaoImpl implements UserInfoDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;

	public List<UserInfo> selectAll() {
		List<UserInfo> list = new ArrayList();
		try {
			// 1.获得数据库连接
			Connection conn = DBUtil.getConnection();
			// 2.创建SQL语句
			String sql = "select * from user_info";
			// 3.创建statement对象
			Statement st = conn.createStatement();
			// 4.编译并执行SQL语句，并将返回的数据保存到结果集对象中
			ResultSet rs = st.executeQuery(sql);
			// 5.迭代结果集，处理每一条记录
			while (rs.next()) {
				UserInfo userinfo = new UserInfo();
				userinfo.setuId(rs.getLong("u_id"));
				userinfo.setUsername(rs.getString("username"));
				userinfo.setPassword(rs.getString("password"));
				userinfo.setIdCard(rs.getString("id_card"));
				userinfo.setStatus(rs.getInt("status"));

				list.add(userinfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteById(Long id) {
		int num = 0;
		try {
			// 1.获得数据库连接
			conn = DBUtil.getConnection();
			// 2.创建SQL语句
			// String sql = "delete from user_info"+id;
			String sql = "delete from user_info where u_id=?";
			// 3.创建Preparedstatement对象 
			ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			// 4.编译并执行SQL语句，并将返回的数据保存到结果集对象中
			num = ps.executeUpdate(); // 如果执行了sql的查询语句，则num变为1，未执行则保持默认赋值0

		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int insertById(UserInfo userinfo) {
		int num = 0;
		Connection conn = DBUtil.getConnection();
		try {
			// 1.获得数据库连接
			// 2.创建SQL语句
			String sql = "insert into user_info(username,password,id_card,status) values(?,?,?,?)";
			// 3.创建Preparedstatement对象
			ps = conn.prepareStatement(sql);
			// ps.setLong(1, userinfo.getuId());
			ps.setString(1, userinfo.getUsername());
			ps.setString(2, userinfo.getPassword());
			ps.setString(3, userinfo.getIdCard());
			ps.setInt(4, userinfo.getStatus());
			// 4.编译并执行SQL语句，并将返回的数据保存到结果集对象中
			num = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;

	}

	@Override
	public int editById(UserInfo userinfo) {
		int num = 0;
		try {
			// 1.获得数据库连接
			conn = DBUtil.getConnection();
			// 2.创建SQL语句
			String sql = "update user_info set username = ?, password = ?, id_card =?, status =? where u_id=?";
			// 3.创建Preparedstatement对象
			ps = conn.prepareStatement(sql);
			ps.setString(1, userinfo.getUsername());
			ps.setString(2, userinfo.getPassword());
			ps.setString(3, userinfo.getIdCard());
			ps.setInt(4, userinfo.getStatus());
			ps.setLong(5, userinfo.getuId());
			// 4.编译并执行SQL语句，并将返回的数据保存到结果集对象中
			num = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}


	
	@Override
	public PageModel<UserInfo> selectByPage(PageModel<UserInfo> pageModel) {
		try {
			// 1.获得数据库连接
			conn = DBUtil.getConnection();
			// 2.拼接SQL语句
			StringBuilder builder = new StringBuilder();
			builder.append("SELECT * FROM(").append("SELECT INFO.*, ROW_NUMBER()  OVER(ORDER BY INFO.U_ID ASC)  RN ")
					.append("FROM USER_INFO INFO").append(")WHERE RN BETWEEN ? AND ?");
			// 3.创建Preparedstatement对象
			ps = conn.prepareStatement(builder.toString());
			ps.setInt(1, pageModel.getStart());
			ps.setInt(2, pageModel.getEnd());
			// 4.编译并执行SQL语句，并将返回的数据保存到结果集对象中
			rs = ps.executeQuery();
			// 5.迭代结果集，处理每一条记录
			List<UserInfo> list = new ArrayList<>();
			while (rs.next()) {
				UserInfo info = new UserInfo();
				info.setuId(rs.getLong("u_id"));
				info.setUsername(rs.getString("username"));
				info.setPassword(rs.getString("password"));
				info.setIdCard(rs.getString("id_card"));
				info.setStatus(rs.getInt("status"));

				list.add(info);
			}
			pageModel.setList(list);
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.release(conn, st, rs);
		}

		return pageModel;

	}

	public static void main(String[] args) {
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		// lambda表达式，必须1.8以上JRE版本可以使用
		// userInfoDao.selectAll().forEach(System.out::println);
		// System.out.println(userInfoDao.deleteById((long) 5));
		// System.out.println(userInfoDao.deleteById(4L));
		// System.out.println(userInfoDao.deleteById(3L));
		// System.out.println(userInfoDao.insertById(new UserInfo(111L,
		// "xiaoliu", "123", "12345", 1)));
		// int i=0;
		// for(;i<10;i++){
		// System.out.println(userInfoDao.insertById(new UserInfo(null,
		// "xiaoliu", "123", "12345", 1)));
		// }

		// System.out.println(userInfoDao.editById(new
		// UserInfo(5L,"zhanglong","123","12345",1)));
		
		PageModel<UserInfo> pageModel = new PageModel<>();
		pageModel.setPagesize(2);
		pageModel.setPagenum(1);
		pageModel.setTotalrows(userInfoDao.selectAll().size());
		
		userInfoDao.selectByPage(pageModel);
		pageModel.getList().forEach(System.out::println);
	}

}
