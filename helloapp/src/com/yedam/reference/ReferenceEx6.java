package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {
		// 학생 3명. 홍길동의 영어,수학, 김길동 영어,수학, 박길동~
		int[][] intAry = { new int[] { 80, 90 }, // 홍
				new int[] { 85, 95 }, // 김
				new int[] { 70, 80 } // 박
		};
		System.out.printf("홍길동의 영어점수 %d \n", intAry[0][0]);

		int engsum = 0;
		int mathsum = 0;
		int totalsum = 0;
		for (int i = 0; i < intAry.length; i++) {
			engsum += intAry[i][0];
		}

		for (int i = 0; i < intAry.length; i++) {
			mathsum += intAry[i][1];
		}

		System.out.printf("영어점수의 총합은 %d \n", engsum);
		System.out.printf("수학점수의 총합은 %d \n", mathsum);

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				totalsum += intAry[i][j];
			}
		}
		System.out.println(totalsum);
		String[] nameAry = { "홍길동", "김길동", "박길동" };

		Scanner scn = new Scanner(System.in);
		System.out.println("학생이름 :");
		String searchName = scn.nextLine();
		
		int check = 0;
		
		for (int i = 0; i < nameAry.length; i++) {
			if (nameAry[i].equals(searchName)) {
				System.out.printf("%s의 영어점수는 %d 수학점수는 %d \n", nameAry[i], intAry[i][0], intAry[i][1]);
				check++;
			}
		}
		
		if (check == 0) {
			System.out.println("찾는 학생이 없습니다.");
		}

		scn.close();
	}
}
