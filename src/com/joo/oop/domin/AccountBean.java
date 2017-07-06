package com.joo.oop.domin;

public class AccountBean {
	private String name,id,pw,ssn,ddate,accountNo;
	private int deposit;
	public final static String BankName="KB국민은행";
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setPw(String pw){
		this.pw=pw;
	}
	public String getPw(){
		return pw;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setDdate(String ddate){
		this.ddate=ddate;
	}
	public String getDdate(){
		return ddate;
	}
	public void setDeposit(int deposit){
		this.deposit=deposit;
	}
	public int getDeposit(){
		return deposit;
	}
	public void setAccountNo(String accountNo){
		this.accountNo=accountNo;
	}
	public String getAccountNo(){
		return accountNo;
	}
	public String toString(){
		return BankName+" "+accountNo+" "+name+" "+deposit+" "+ddate+"\n";
	}
}
