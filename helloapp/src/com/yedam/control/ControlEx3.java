package com.yedam.control;

public class ControlEx3 {
	public static void main(String[] args) {
		int mon = 6;
		System.out.printf("========= %d월 달력 =========\n",mon);
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
		for (int i = 1; i <= getFirstDate(mon); i++) {
			System.out.printf("%3s ", "");
		}
		for (int day = 1; day <= getLastDate(mon); day++) {
			System.out.printf("%3d ", day);
			if ((getFirstDate(mon)+day) % 7 == 0) {
				System.out.println();
			}
		}
	}

	// 4, 5 ,6월 달력. switch~case 구문
	public static int getFirstDate(int month) {
		int firstday = 0;
		switch (month) {
		case 4:
			firstday = 6;
			break;
		case 5:
			firstday = 1;
			break;
		case 6:
			firstday = 4;
		}
		return firstday;
	}

	public static int getLastDate(int month) {
		int lastday = 30;
		switch (month) {
		case 4, 6:
			lastday=30; break;
		case 5:
			lastday=31; break;
		}
		return lastday;
	}
	
	
	public static void method1() {

		// 반복문 : for, while, do~while
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1)
				System.out.printf("i의 값은 %d \n", i);
//					else
//						System.out.println("짝수입니다");
		}
	} // end of method1.

	public static void method2() {
		for (int dan = 0; dan < 10; dan++) {
			if (dan == 0) {
				for (int i = 2; i < 10; i++) {
					System.out.printf("=== %d단 ===\t", i);
				}
			}
			for (int i = 2; i < 10; i++) {
				System.out.printf("%d * %d = %2d\t", i, dan, (dan * i));
			}
			System.out.printf("\n");
		}
	} // end of method2

}
