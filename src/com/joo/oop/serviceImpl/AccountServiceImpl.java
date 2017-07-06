package com.joo.oop.serviceImpl;

import java.util.Calendar;
import java.util.Vector;

import com.joo.oop.domin.AccountBean;
import com.joo.oop.service.AccountService;

public class AccountServiceImpl implements AccountService {
	Vector<AccountBean> list;
	public AccountServiceImpl() {
		list=new Vector<AccountBean>(10,10);
	}
	@Override
	public void addAccount(AccountBean account) {
		Calendar now=Calendar.getInstance();
		account.setDdate(now.get(now.YEAR)+"-"+now.get(now.MONTH)+"-"+now.get(now.DATE));
		account.setAccountNo(String.valueOf((int)(Math.random()*9999999+10000000)));
		list.add(account);
	}

	@Override
	public AccountBean findByAccount(String account) {
		AccountBean byAccount=null;
		for (int i = 0; i < list.size(); i++) {
			if(account.equals(list.get(i).getAccountNo()))
			{
				byAccount=(list.get(i));
			}
		}
		return byAccount;
	}

	@Override
	public Vector<AccountBean> findByName(String name) {
		Vector<AccountBean> vec=new Vector<AccountBean>(5,1);
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName()))
			{
				vec.add(list.get(i));
			}
		}
		return vec;
	}

	@Override
	public int allCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public void updatePw(AccountBean account) {
		for (int i = 0; i < list.size(); i++) {
			if(account.getAccountNo().equals(list.get(i).getAccountNo())){
				list.get(i).setPw(account.getPw());
			}
		}
	}

	@Override
	public void updateInDeposit(AccountBean account) {
		for (int i = 0; i < list.size(); i++) {
			if(account.getAccountNo().equals(list.get(i).getAccountNo())){
				list.get(i).setDeposit(list.get(i).getDeposit()+account.getDeposit());
			}
		}
	}

	@Override
	public void updateOutDeposit(AccountBean account) {
		for (int i = 0; i < list.size(); i++) {
			if(account.getAccountNo().equals(list.get(i).getAccountNo())){
				list.get(i).setDeposit(list.get(i).getDeposit()-account.getDeposit());
			}
		}
	}

	@Override
	public void deleteAccount(String account) {
		for (int i = 0; i < list.size(); i++) {
			if(account.equals(list.get(i).getAccountNo()))
			{
				list.remove(list.get(i));
			}
		}
		
	}
	@Override
	public Vector<AccountBean> accountList() {
		// TODO Auto-generated method stub
		return list;
	}

}
