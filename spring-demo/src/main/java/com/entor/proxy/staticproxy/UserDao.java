package com.entor.proxy.staticproxy;

import org.springframework.stereotype.Component;

/**
 * 目标类
 * @author Administrator
 *
 */
@Component
public class UserDao implements IUserDao{

	//UserDao实现IUserDao，重写save方法
	@Override
	public void save() {
		System.out.println("--已保存数据！--");
		
	}
	

}
