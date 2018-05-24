package com.entor.proxy.staticproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 代理类
 * @author Administrator
 *
 */
@Component
public class UserDaoProxy implements IUserDao {

	@Autowired
	private UserDao userDao;

	@Override
	public void save() {
		System.out.println("开始执行事务！");
		userDao.save();
		System.out.println("事务执行结束，提交事物！");

	}

}
