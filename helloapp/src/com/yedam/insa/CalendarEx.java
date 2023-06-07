package com.yedam.insa;

import java.util.Calendar;

public class CalendarEx {
	static Calendar cal = Calendar.getInstance();

	static void set(int year, int month) {
		cal.set(year, month-1, 1);
	}

	static void cal() {
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH)+1;
		int dow = cal.get(Calendar.DAY_OF_WEEK);

		System.out.printf("%d년 %d월 달력\n", year, mon);
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		for (int i = 1; i < dow; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%3d ", i);
			if ((dow + i) % 7 == 1) {
				System.out.println();
			}
		}
	}
}
