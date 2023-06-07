package com.yedam.classes;

public class Calculator {
	// 인스턴스마다 동일한 값
	static final double PI = 3.14; // final==상수 대문자 이용
	// static 메소드 연산.
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("더한결과: " + result);
	}

	public static void minus(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("뺀 결과: " + result);
	}
	public static void getArea(int radius) {
		double result = PI * radius * radius;
		System.out.println(result);
	}
}
