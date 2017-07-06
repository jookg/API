package com.joo.oop.service;

import java.util.Vector;

import com.joo.oop.domin.AccountBean;

public interface AccountService {
	public void addAccount(AccountBean account);
	public Vector<AccountBean> accountList();
	public Vector<AccountBean> findByName(String name);
	public AccountBean findByAccount(String account);
	public int allCount();
	public void updatePw(AccountBean account);
	public void updateInDeposit(AccountBean account);
	public void updateOutDeposit(AccountBean account);
	public void deleteAccount(String account);
}
