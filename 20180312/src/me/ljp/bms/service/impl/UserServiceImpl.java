package me.ljp.bms.service.impl;

import me.ljp.bms.dao.UserDao;
import me.ljp.bms.dao.impl.UserDaoImpl;
import me.ljp.bms.entity.UserInfo;
import me.ljp.bms.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public void saveUser(UserInfo userInfo) {
		userInfo.setUid(userDao.getMaxId() + 1);
        userInfo.setStatus(1);
        userDao.insertUser(userInfo);
	}

	@Override
	public boolean isIdCardOnlyOne(String idCard) {
		return false;
	}

	@Override
	public boolean loginValidate(String idCard, String password) {
		return false;
	}

	@Override
	public UserInfo getUserInfoByIdCard(String idCard) {
		return null;
	}

}
