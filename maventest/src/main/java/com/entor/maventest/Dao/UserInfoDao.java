package com.entor.maventest.Dao;

import java.util.List;

import com.entor.maventest.entity.UserInfo;
import com.entor.maventest.util.PageModel;

/**
 * 数据库连接接口
 * @author Administrator
 *
 */
public interface UserInfoDao {
	List<UserInfo> selectAll();

	int deleteById(Long id);
	
	int insertById(UserInfo userinfo);
	
	int editById(UserInfo userinfo);
	
	PageModel<UserInfo> selectByPage(PageModel<UserInfo>pageModel);
}
