package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수입력. 점수출력, 최고점수, 평균점수
		Scanner scn = new Scanner(System.in);
		int studentNum = 0;
		int[] scores = null;
		boolean run = true;

		while (run) {
			System.out.println("======================================");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("======================================");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) { // 학생수
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) { // 배열의 크기만큼 점수입력
				if (scores == null) {
					System.out.println("학생수를 먼저 입력해 주세요.");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]>", i + 1);
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo == 3) { // 배열의 점수출력
				if (scores == null) {
					System.out.println("학생수를 먼저 입력해 주세요.");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i + 1, scores[i]);
				}
			} else if (selectNo == 4) { // 분석: 최고점, 평균
				if (scores == null) {
					System.out.println("학생수를 먼저 입력해 주세요.");
					continue;
				}
				double sum = 0;
				double avg = 0;
				int maxScore = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (maxScore < scores[i]) {
						maxScore = scores[i];
					}
				}
				avg = sum / (scores.length);
				System.out.printf("최고 점수 : %d \n", maxScore);
				System.out.printf("평균 점수 : %.2f \n", avg);

			} else if (selectNo == 5) { // 종료
				run = false;
				System.out.println("종료합니다.");
			}
		}
		System.out.println("end of prog");
		scn.close();
	}
}
