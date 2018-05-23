package me.ljp.bms.dao.impl;

import java.util.List;

import me.ljp.bms.dao.UserDao;
import me.ljp.bms.entity.UserInfo;
import me.ljp.bms.utils.EditUtils;
import me.ljp.bms.utils.ReadAndWriteUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public void insertUser(UserInfo userInfo) {
		ReadAndWriteUtils.singleWrite(EditUtils.userInfoToString(userInfo));
	}

	@Override
	public List<UserInfo> getAll() {
		return ReadAndWriteUtils.readAllUserRecords();
	}

	@Override
	public Integer getMaxId() {
		List<UserInfo> list = getAll();
		Integer maxId = 0;
		for (UserInfo userInfo : list) {
			if (userInfo != null && userInfo.getUid() > maxId) {
				maxId = userInfo.getUid();
			}
		}
		return maxId;
	}

	@Override
	public UserInfo selectUserInfoByIdCard(String idCard) {
		List<UserInfo> list = getAll();
		for (UserInfo userInfo : list) {
			if (userInfo != null && userInfo.getIdCard().equals(idCard)) {
				return userInfo;
			}
		}
		return null;
	}
}
