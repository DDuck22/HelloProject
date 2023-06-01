package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3];

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int n=0;
		
		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택> ");
			int num = Integer.parseInt(scn.nextLine());
			if (num == 1) { // 등록
				Bank b1 = new Bank();
				if(n>2) {
					System.out.println("최대치까지 등록되었습니다.");
					continue;
				}
				System.out.println("계좌번호 등록");
				String accno = scn.nextLine();
				if (n != 0){
					boolean checkA=false;
					for(int i=0;i<n;i++) {
						if(accounts[i].accountNo.equals(accno)) {
							System.out.println("등록된 계좌번호 입니다.");
							checkA=true;
							break;
						}
					}
					if(checkA) {
						continue;
					}
				}
				b1.accountNo=accno;
				System.out.println("예금주명");
				b1.owner=scn.nextLine();
				System.out.println("예치금");
				b1.balance=Integer.parseInt(scn.nextLine());
				accounts[n]=b1;
				n++;
			} else if (num == 2) { // 조회
				if(n==0) {
					System.out.println("계좌를 먼저 등록해주세요");
					continue;
				}
				System.out.println("조회할 계좌번호를 입력해 주세요");
				String checkAccount=scn.nextLine();
				for(int i=0;i<n;i++) {
					if(accounts[i].accountNo.equals(checkAccount)) {
						System.out.println("잔고 : "+accounts[i].balance);
					}else {
						System.out.println("등록된 계좌가 없습니다.");
					}
						
				}
			} else if (num == 3) { // 입금
				if(n==0) {
					System.out.println("계좌를 먼저 등록해주세요");
					continue;
				}
				System.out.println("입금할 계좌번호를 입력해주세요");
				String checkAccount=scn.nextLine();
				for(int i=0;i<n;i++) {
					if(accounts[i].accountNo.equals(checkAccount)) {
						System.out.println("입금할 금액 입력");
						int money = Integer.parseInt(scn.nextLine());
						accounts[i].balance += money;
						System.out.println("잔고는 : "+accounts[i].balance);
						break;
					}else {
						System.out.println("등록된 계좌가 없습니다.");
					}
				}
			} else if (num == 4) { // 출금
				if(n==0) {
					System.out.println("계좌를 먼저 등록해주세요");
					continue;
				}
				System.out.println("출금할 계좌번호를 입력해주세요");
				String checkAccount=scn.nextLine();
				for(int i=0;i<n;i++) {
					if(accounts[i].accountNo.equals(checkAccount)) {
						System.out.println("입금할 금액 입력");
						int money = Integer.parseInt(scn.nextLine());
						if(accounts[i].balance<money) {
							System.out.println("잔액이 부족합니다");
							continue;
						}
						accounts[i].balance -= money;
						System.out.println("잔고는 : "+accounts[i].balance);
						break;
					}else {
						System.out.println("등록된 계좌가 없습니다.");
					}
				}
			} else if (num == 5) { // 종료
				run = false;
			}
		}
		System.out.println("끝");
	}
}
