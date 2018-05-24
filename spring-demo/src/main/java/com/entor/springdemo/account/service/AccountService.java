package com.entor.springdemo.account.service;

/**
 * 转账
 * 
 * @param in 进账
 * @param out 除账
 * @param money 金额
 * @author Administrator
 *
 */

public interface AccountService {

	void transfer(Integer in, Integer out, double money);
}
