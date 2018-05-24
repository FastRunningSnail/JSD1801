package com.entor.maventest.Dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.entor.maventest.Dao.TransferDao;
import com.entor.maventest.util.DBUtil;

import oracle.jdbc.oracore.OracleType;

public class TransferDaoImpl implements TransferDao {
	private Connection conn;
	private CallableStatement cs;

	@Override
	public boolean transfer(Long inId, Long outId, double money) {
		boolean result = false;
		try {
			// 1.创建数据库连接
			conn = DBUtil.getConnection();
			// 取消默认提交事务
			conn.setAutoCommit(false);
			// 2.创建SQL语句
			String sql = "call transfer(?,?,?,?)";
			// 3.创建CallableStatement对象
			cs = conn.prepareCall(sql);
			// 设置注册参数
			cs.setLong(1, inId);
			cs.setLong(2, outId);
			cs.setDouble(3, money);
			// 设置注册输出参数，通过打印参数值判断是否成功
			cs.registerOutParameter(4, OracleType.STYLE_INT);
			// 4.编译并执行存储过程
			cs.execute();
			if (cs.getInt(4) == 1)
				result = true;
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
			if (conn != null)
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		} finally {
			// 调用release方法释放；连接资源
			DBUtil.release(conn, cs, null);
		}
		return result;

	}

	public static void main(String[] args) {
		TransferDao transferDao = new TransferDaoImpl();
		System.out.println(transferDao.transfer(1L, 2L, 2000));
	}
}
