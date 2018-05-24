package com.entor.maventest.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	// 初始化properties
	private static Properties properties = new Properties();

	/**
	 * 创建连接对象
	 */
	private static Connection conn;

	/**
	 * 静态代码快，初始化工具类
	 */
	static {
		try {
			// InputStream is =
			// DBUtil.class.getResourceAsStream("jdbc.properties");//典型错误。
			InputStream is = DBUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			properties.load(is);
			// 加载驱动
			Class.forName(properties.getProperty("jdbc.driver_class"));
			// 连接对象
			conn = DriverManager.getConnection(properties.getProperty("jdbc.connection.url"),
					properties.getProperty("jdbc.connection.username"),
					properties.getProperty("jdbc.connection.password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 返回当前数据库连接，方便其他java程序调用DBUtil类里的getConnection()与数据库建立连接
	 */
	public static Connection getConnection() {
		return conn;
	}

	public static void release(Connection conn, Statement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (st != null) {
				st.close();
				st = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
