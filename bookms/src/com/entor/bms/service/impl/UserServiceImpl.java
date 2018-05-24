package com.entor.bms.service.impl;

import com.entor.bms.dao.UserDAO;
import com.entor.bms.dao.impl.UserDAOImpl;
import com.entor.bms.entity.UserInfo;
import com.entor.bms.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();

    /**
     * 调用数据访问层的添加用户的方法
     *
     * @param userInfo
     */
    @Override
    public void saveUser(UserInfo userInfo) {
        // 设置用户id，用户id是maxId + 1
        userInfo.setUid(userDAO.getMaxId() + 1);
        // 设置用户状态
        userInfo.setStatus(1);
        // 调用dao插入用户的操作
        userDAO.insertUser(userInfo);
    }

    @Override
    public boolean isIdCardOnlyOne(String idCard) {
        // 1.查询出所有的记录
        List<UserInfo> list = userDAO.getAll();

        // 2.在所有记录中验证idCard唯一性
        for (UserInfo userInfo : list) {
            if (idCard.equals(userInfo.getIdCard())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean loginValidate(String idCard, String password) {
        // 1.查询出所有的记录
        List<UserInfo> list = userDAO.getAll();
        // 2.匹配证件和密码
        for (UserInfo userInfo : list) {
            if (idCard.equals(userInfo.getIdCard()) && password.equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public UserInfo getUserInfoByIdCard(String idCard) {
        return userDAO.selectUserInfoByIdCard(idCard);
    }
}
