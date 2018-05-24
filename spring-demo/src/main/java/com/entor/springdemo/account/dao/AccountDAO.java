package com.entor.springdemo.account.dao;

public interface AccountDAO {

	public void in(Integer id, double money);

	public void out(Integer id, double money);

}
