package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
		Scanner scn1 = new Scanner(System.in);
		System.out.println("첫번째 값 입력");
		int num1 = scn1.nextInt();
		System.out.println("두번째 값 입력");
		int num2 = scn1.nextInt();
		thirdMethod(num1,num2);
		
		scn1.close();
		//firstMethod();
		//secondMethod();
	}

	public static void firstMethod() {
		// Scanner 사용하여 입력값을 2개
		// a, b => a의 b제곱값을 출력
		Scanner scn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int square = 1;
		try {
			System.out.println("a의 b제곱 출력");
			System.out.println("a=?");
			a = scn.nextInt();
			System.out.println("b=?");
			b = scn.nextInt();
			for (int i = 1; i <= b; i++) {
				square *= a;
			}
		} catch (Exception e) {
			System.out.println("숫자가 아님");
		}
		System.out.println(square);

		scn.close();
	} // end of firstMethod

	public static void secondMethod() {
		// scanner 활용
		// 문장을 받고, 숫자를 받아서 => 문장을 3번반복해서 출력
		Scanner scn = new Scanner(System.in);
		String str = "";
		int num = 0;
		try {
		System.out.println("문장을 n회 출력");
		System.out.println("문장을 입력해주세요");
		str = scn.nextLine();
		System.out.println("숫자를 입력해주세요");
		num = scn.nextInt();
		}catch (Exception e) {
			System.out.println("잘못입력했습니다");
		}
		for(int i=1;i<=num;i++) {
			System.out.println(str);
		}
		scn.close();
	} // end of secondMethod
	
	public static void thirdMethod(int a, int b) {
		int result = a+b;
		System.out.println(a+"+"+b+" = " + result);
		
	}
}
