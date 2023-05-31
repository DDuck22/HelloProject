package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {
	// 메소드 = 함수인데 객체(object)에 소속되어있는 메소드.
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result = 0; //변수 선언
		Scanner scn = new Scanner(System.in); //스캐너 선언
		try {
			System.out.println("숫자1 입력");
			num1 = scn.nextInt(); // 숫자입력
			System.out.println("숫자2 입력");
			num2 = scn.nextInt(); // 숫자입력
			if (num1 > num2) { // 1번이 2번보다 클때 둘이 바꿔주기위함
				int num3 = num2; //임시로 3에 2를 넣음
				num2 = num1; //2에 1을 넣음> 2가 사라지니까
				num1 = num3; //3을 1에 넣어서 1과 2을 바꿈
			}
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
		}
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		System.out.println(num1 + "부터 " + num2 + "까지의 합은 : " + result);
		scn.close();
	}
}
