package com.yedam.control;

import java.util.Scanner;

public class ControlEx2 {
	public static void main(String[] args) {
		// 12월
		// 메소드 마지막 날짜값: 1>31, 2>28, 3>31, 4>30,8>31,9>30
		Scanner scn = new Scanner(System.in);

		try {
			while (true) {
				int mon = scn.nextInt();
				if (mon >= 1 && mon <= 12) {
					System.out.printf("%d월달의 마지막 날은 %d \n", mon, getLastDate(mon));
				} else if (mon == 123) {
					break;
				} else {
					System.out.println("다시입력");
				}
			}
		} catch (Exception e) {
			System.out.println("다시입력");
		}
		scn.close();
	}

	public static int getLastDate(int month) {
		int result = 0;
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			result = 31;
			break;
		case 2:
			result = 28;
			break;
		case 4, 6, 9, 11:
			result = 30;
		}
		return result;
	}

	public static void method1() {
		int result = (int) (Math.random() * 3) + 1;
		switch (result) {
		case 1:
			System.out.println("가위.");
			break;
		case 2:
			System.out.println("바위.");
			break;
		case 3:
			System.out.println("보.");
		}
		result = (int) (Math.random() * 91) + 10;
		switch (result / 10) {
		case 10:
			System.out.printf("%d A+", result);
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.printf("%d D \n", result);
		}
		System.out.println("end of prog.");

	}
}
