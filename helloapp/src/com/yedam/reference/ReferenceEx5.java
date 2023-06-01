package com.yedam.reference;

public class ReferenceEx5 {
	public static void method1() {

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);
		int d = (int) (Math.random() * 100);
		// 제일큰수 intAry의 첫번째:제일 큰값...제일 작은값.
		// intAry[0] = 85, intAry[1] = 34, intAry[2] = 22
		int[] intAry = { a, b, c, d };
//		for (int i = 0; i < intAry.length - 1; i++) {
//			int aa = intAry[i];
//			int bb = intAry[i + 1];
//			if (aa < bb) {
//				intAry[i] = bb;
//				intAry[i + 1] = aa;
//				i = -1;
//			}
//		}
		for (int i = 0; i < intAry.length - 1; i++) {
			for (int j = i + 1; j < intAry.length; j++) {
				if (intAry[i] < intAry[j]) {
					int temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = temp;
				}
			}
		}

		for (int num : intAry) {
			System.out.println(num);
		}

	}

	public static void main(String[] args) {
		int[] intAry = new int[10];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 100);
		}

		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length - 1; i++) {
				int temp = 0;
				if (intAry[i] < intAry[i + 1]) {
					temp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = temp;
				}
			}
		}
		for(int num :intAry) {
			System.out.println(num);
		}
	}
}
