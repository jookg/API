package com.joo.oop.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import com.joo.oop.domin.AccountBean;
import com.joo.oop.service.AccountService;
import com.joo.oop.serviceImpl.AccountServiceImpl;

public class AccountController {

	public static void main(String[] args) {
		AccountBean ab=null;
		AccountService as=new AccountServiceImpl();
		while(true){
			switch (JOptionPane.showInputDialog("0.종료 1.계좌만들기 2.리스트 3.검색(이름) 4.검색(계좌번호) 5.전체 계좌수 6.패스워드변경 7.입금 8.출금 9.계좌삭제")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				ab=new AccountBean();
				ab.setName(JOptionPane.showInputDialog("이름"));
				ab.setPw(JOptionPane.showInputDialog("비밀번호"));
				ab.setSsn(JOptionPane.showInputDialog("주민번호"));
				ab.setDeposit(Integer.parseInt(JOptionPane.showInputDialog("예금액")));
				as.addAccount(ab);
				JOptionPane.showMessageDialog(null, "개설완료");
				break;
			case "2":
				Vector<AccountBean> list=as.accountList();
				String result="";
				for (int i = 0; i < list.size(); i++) {
					result+=list.get(i);
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, as.findByName(JOptionPane.showInputDialog("검색할 이름")));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, as.findByAccount(JOptionPane.showInputDialog("검색할 계좌")));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, "계좌수 "+as.allCount()+"개");
				break;
			case "6":
				ab=new AccountBean();
				ab.setAccountNo(JOptionPane.showInputDialog("계좌번호"));
				ab.setPw(JOptionPane.showInputDialog("바꿀 비밀번호"));
				as.updatePw(ab);
				JOptionPane.showMessageDialog(null, "변경되었습니다");
				break;
			case "7":
				ab=new AccountBean();
				ab.setAccountNo(JOptionPane.showInputDialog("계좌번호"));
				ab.setDeposit(Integer.parseInt(JOptionPane.showInputDialog("입금액")));
				as.updateInDeposit(ab);
				JOptionPane.showMessageDialog(null, "입금완료");
				break;
			case "8":
				ab=new AccountBean();
				ab.setAccountNo(JOptionPane.showInputDialog("계좌번호"));
				ab.setDeposit(Integer.parseInt(JOptionPane.showInputDialog("출금액")));
				as.updateOutDeposit(ab);
				JOptionPane.showMessageDialog(null, "출금완료");
				break;
			case "9":
				as.deleteAccount(JOptionPane.showInputDialog("계좌번호"));
				JOptionPane.showMessageDialog(null, "삭제완료");
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못입력");
				break;
			}
		}
	}

}
