package me.ljp.bms.service;

import me.ljp.bms.entity.UserInfo;

public interface UserService {
	/**
	 * ����ע���û�
	 *
	 * @param userInfo
	 */
	
	void saveUser(UserInfo userInfo);

	boolean isIdCardOnlyOne(String idCard);

	boolean loginValidate(String idCard, String password);

	UserInfo getUserInfoByIdCard(String idCard);
}
