package me.ljp.bms.dao;

import java.util.List;

import me.ljp.bms.entity.UserInfo;

public interface UserDao {
	 /**
     * Ìí¼Ó×¢²áÊý¾Ý
     *
     * @param userInfo
     */
    void insertUser(UserInfo userInfo);

    List<UserInfo> getAll();

    Integer getMaxId();

    UserInfo selectUserInfoByIdCard(String idCard);
}
