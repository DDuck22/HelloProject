package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
		// 기본입력. 입력값이 대문자, 소문자, 숫자 => 출력
		// A 65 Z 90 a 97 z 122 0 48 9 56
		// q가 113 => 종료.
		int result = 0;
		System.out.println("값을 입력하세요.");
		while (true) {
			try {
				while (true) {
					result = System.in.read();
					if(result == 113) {
						break;
					}
					if (result <= 90 && result >= 65) {
						System.out.println("대문자입니다");
					} else if (result <= 122 && result >= 97) {
						System.out.println("소문자입니다.");
					} else if (result <= 57 && result >= 48) {
						System.out.println("숫자입니다.");
					} else if (result == 13 || result == 10) {
						break;
					} else {
						System.out.println("기타값입니다");
					}
				}
				if(result == 113) {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("끝");
	}
}
