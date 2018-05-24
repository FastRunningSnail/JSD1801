package com.entor.springdemo.account.service.impl;

import com.entor.springdemo.account.dao.AccountDAO;
import com.entor.springdemo.account.service.AccountService;

public class AccountServiceImpl implements AccountService{

	private AccountDAO accountDAO;
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	@Override
	public void transfer(Integer in, Integer out, double money) {
		try {
			accountDAO.in(in,money);
//			System.out.println(2/0);
			accountDAO.out(out,money);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
