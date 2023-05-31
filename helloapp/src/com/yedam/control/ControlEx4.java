package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		// 1~100까지 3배수 합계 method1()
		// Math.random() 의 2번실행 > 두수의 합이 5가 되는 경우.
		// 1,4/2,3/3,2 의경우 반복중단 method2()
		// 반복문 for 활용.
		// *
		// **
		// ***
		// **** method3()
		method1();
		method2();
		method3();
		System.out.println();
		method4();
	}

	public static void method1() {
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				result += i;
			}
		}
		System.out.println(result);
	} // end method1

	public static void method2() {
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			System.out.println(dice1);
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println(dice2);
			System.out.printf("%d + %d = %d\n", dice1, dice2, dice1 + dice2);
			if (dice1 + dice2 == 5) {
				break;
			}
		}
	} // end method2

	public static void method3() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	} // end method3

	public static void method4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i + j > 4) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}
