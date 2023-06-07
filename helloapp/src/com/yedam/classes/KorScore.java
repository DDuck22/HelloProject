package com.yedam.classes;
// data: int[] : 필드.

// 기능 : 전체 출력
//		 합계
//       최대값

public class KorScore {
	// (인스턴스) 필드.
	int[] kor = new int[] {100,80,70};

	// 생성자가 없으면 기본생성자가 만들어짐 KorScore() {}
//	KorScore(int[] scores) {
//		kor = scores;
//	}
	
	// (인스턴스) 메소드.
	public void print() { // 전체 출력
		for (int score : kor) {
			System.out.println(score);
		}
	}

	
	public void total() { // 합계 출력
		int sum = 0;
		for (int score : kor) {
			sum += score;
		}
		System.out.println(sum);
	}

	public void max() { // 최대값 출력
		int max = 0;
		for (int score : kor) {
			if (max < score) {
				max = score;
			}
		}
		System.out.println(max);
	}
}