package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		// 0~1사이의 임의의 수 생성
//		String msg = "";
		int result = 0;
		while(result!=10){
			 result = (int) (Math.random() * 91) + 10;
				System.out.println(result);
		} ;
//			if (result >= 90) {
//				msg = "A";
//			} else if (result >= 80 && result <= 89) {
//				msg = "B";
//			} else if (result >= 70 && result <= 79) {
//				msg = "C";
//			} else {
//				msg = "D";
//			}
//			System.out.printf("점수 %d는 %s등급입니다",result,msg);
		// Math.random을 활용해서 10~100까지의 임의의 수.
		// 생성된 값이 100~90 A출력
		// 80~89 B, 70~79 C, else D
	}
}
