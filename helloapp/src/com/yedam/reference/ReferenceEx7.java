package com.yedam.reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		// 학교의 학생들의 키. a반(2), b반(4), c반(3).
		double[][] heightAry = {
				{173.5, 168.3},
				{175.3, 189.5, 180.7, 159.5},
				{171.5, 162.9, 185.3}
		};
//		System.out.println(heightAry[1].length);
		
		for(int i=0;i<heightAry.length;i++) {
			double sum=0;
			double avg=0;
			for(int j=0;j<heightAry[i].length;j++) {
				sum += heightAry[i][j];
			}
			avg=sum/heightAry[i].length;
			System.out.printf("%d반의 평균키는 %.1f \n",i+1,avg);
		}
	}
}
