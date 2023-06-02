package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {

	static Bank[] accounts = new Bank[3];
	static Scanner scn = new Scanner(System.in);
	static int n = 0;

	// 조회계좌정보 유무.
	public static boolean checkAccount(String accountNo) {
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}

	public static void registerAccount() {

		Bank b1 = new Bank();
		if (n > (accounts.length - 1)) {
			System.out.println("최대치까지 등록되었습니다.");
			// continue; // 반복문안에서 return.
			return;
		}
		System.out.printf("계좌번호 등록> ");
		String account = scn.nextLine();
		if (n != 0) {
			boolean checkA = false;
			for (int i = 0; i < n; i++) {
				if (accounts[i].getAccountNo().equals(account)) {
					System.out.println("등록된 계좌번호 입니다.");
					checkA = true;
					break;
				}
			}
			if (checkA) {
				// continue;
				return;
			}
		}
		b1.setAccountNo(account);
		System.out.printf("예금주명> ");
		b1.setOwner(scn.nextLine());
		System.out.printf("금액> ");
		b1.setBalance(Integer.parseInt(scn.nextLine()));
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = b1;
			}
		}
		n++;
	}

	public static void searchAccount() {
		if (n == 0) {
			System.out.println("계좌를 먼저 등록해주세요");
			// continue;
			return;
		}
		System.out.println("조회할 계좌번호를 입력해 주세요");
		String checkAccount = scn.nextLine();
		boolean checkAc = true;
		for (int i = 0; i < n; i++) {
			if (accounts[i].getAccountNo().equals(checkAccount)) {
				System.out.printf("예금주 : %s, 잔액 : %d \n", accounts[i].getOwner(), accounts[i].getBalance());
				checkAc = false;
			}
		}
		if (checkAc) {
			System.out.println("등록된 계좌가 없습니다.");
		}
	}

	public static void deposit() {
		if (n == 0) {
			System.out.println("계좌를 먼저 등록해주세요");
			// continue;
			return;
		}
		System.out.println("입금할 계좌번호를 입력해주세요");
		String checkAccount = scn.nextLine();
		boolean isTrue = checkAccount(checkAccount);
		if (!isTrue) {
			System.out.println("등록된 계좌가 없습니다.");
			return;
		}
		for (int i = 0; i < n; i++) {
			if (accounts[i].getAccountNo().equals(checkAccount)) {
				System.out.println("입금할 금액 입력");
				int money = Integer.parseInt(scn.nextLine());
				accounts[i].setBalance(accounts[i].getBalance() + money);
				System.out.println("잔고는 : " + accounts[i].getBalance());
				break;
			}
		}

	}

	public static void withdraw() {
		if (n == 0) {
			System.out.println("계좌를 먼저 등록해주세요");
			// continue;
			return;
		}
		System.out.println("출금할 계좌번호를 입력해주세요");
		String checkAccount = scn.nextLine();

		boolean isTrue = checkAccount(checkAccount);

		if (!isTrue) {
			System.out.println("등록된 계좌가 없습니다.");
			return;
		}
		for (int i = 0; i < n; i++) {
			if (accounts[i].getAccountNo().equals(checkAccount)) {
				System.out.println("출금할 금액 입력");
				int money = Integer.parseInt(scn.nextLine());
				if (accounts[i].getBalance() < money) {
					System.out.println("잔액이 부족합니다");
					continue;
				}
				accounts[i].setBalance(accounts[i].getBalance() - money);
				System.out.println("잔고는 : " + accounts[i].getBalance());
				break;
			}
		}

	}

	public static void removeAccount() {
		System.out.println("삭제할 계좌");
		String account = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(account)) {
				accounts[i] = null;
				System.out.println("계좌가 삭제되었습니다.");
				n--;
				break;
			}
		}
	}

	public static void main(String[] args) {
		boolean run = true;
		Bank bb = new Bank();
		bb.setAccountNo("11-11");
		bb.setOwner("홍길동");
		bb.setBalance(10000);

		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.삭제 6.종료");
			System.out.print("선택> ");
			int num = Integer.parseInt(scn.nextLine());

			if (num == 1) { // 등록
				registerAccount();

			} else if (num == 2) { // 조회
				searchAccount();

			} else if (num == 3) { // 입금
				deposit();
			} else if (num == 4) { // 출금
				withdraw();

			} else if (num == 5) { // 삭제
				removeAccount();
			} else if (num == 6) { // 종료
				run = false;
				
			}
		}
		System.out.println("끝");
		scn.close();
	}
}
