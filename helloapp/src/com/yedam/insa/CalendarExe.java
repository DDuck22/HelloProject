package com.yedam.insa;

//import java.util.Calendar;

// CalendarEx.java
// CalendarEx.set(int year, int month) => static 메소드
// CalendarEx.cal() => 년,월 -> 달력 그려주는 메소드 => static 메소드

public class CalendarExe {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance(); // 실행시점의 날짜정보
//		cal.set(2023, 7, 5);
//		System.out.printf("%d년 ",cal.get(Calendar.YEAR));
//		System.out.printf("%d월 ",cal.get(Calendar.MONTH)+1); // 0부터 시작
//		System.out.printf("%d일 ",cal.get(Calendar.DATE));
//		System.out.printf("%d 요일 ",cal.get(Calendar.DAY_OF_WEEK)); // 1=일요일 2=월요일..
//		System.out.printf("말일 : %d",cal.getActualMaximum(Calendar.DATE));
		CalendarEx.set(2024, 2);
		CalendarEx.cal();
	}
}
