package com.yedam.object;

import java.util.Scanner;

public class ObjectEx6StudentApp {
	// 학생정보관리 app
	// 1.등록 2.목록 3.조회(이름) 4.수정(점수) 5.삭제 6.종료.
	// 학생정보 : 학생번호(23-001)/이름/성별(남,여)/점수

	static Students[] students = new Students[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.목록 3.조회 4.수정 5.삭제 6.종료.");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				register();
			} else if (selectNo == 2) {
				list();
			} else if (selectNo == 3) {
				search();
			} else if (selectNo == 4) {
				modify();
			} else if (selectNo == 5) {
				remove();
			} else if (selectNo == 6) {
				System.out.println("종료하겠습니다.");
				run = false;
			}
		}
	}

	// 1. register(), 2.list(), 3.search(), 4.modify(), 5.remove()
	// 남학생n명 여학생m명 최고점수: 이름 - xx점,
	public static void register() {
		System.out.println("학생정보 입력");
		System.out.print("학생번호> ");
		String stuId = scn.nextLine();
		boolean idCheck = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStuId().equals(stuId)) {
				System.out.println("중복된 번호입니다.");
				idCheck = true;
			}
		}
		if (idCheck) {
			return;
		}
		System.out.print("이름> ");
		String name = scn.nextLine();
		System.out.print("성별(남/여)> ");
		boolean check = true;
		String sex = scn.nextLine();
		while (check) {
			if (sex.equals("남") || sex.equals("여")) {
				check = false;
			} else {
				System.out.println("다시 입력해주세요");
				sex = scn.nextLine();
			}
		}
		System.out.print("점수> ");
		int score = Integer.parseInt(scn.nextLine());

		Students stu = new Students();
		stu.setStuNo(stuId);
		stu.setStuName(name);
		stu.setStuS(sex);
		stu.setStuScore(score);
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = stu;
				break;
			}
		}
	}

	public static void list() {
		int maxScore=0;
		String maxScoreName="";
		int maleCount=0;
		int femaleCount=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if(maxScore<students[i].getStuScore()) {
					maxScore=students[i].getStuScore();
					maxScoreName=students[i].getStuName();
				}
				if(students[i].getStuS().equals("남")) {
					maleCount++;
				} 
				if(students[i].getStuS().equals("여")){
					femaleCount++;
				}
				System.out.printf("%s %s \n", students[i].getStuId(), students[i].getStuName());
			}
		}
		System.out.printf("남학생 %d명, 여학생 %d명, 최고점수: %s - %d점\n",maleCount,femaleCount,maxScoreName,maxScore);
	}

	public static void search() {
		System.out.println("조회할 학생의 이름을 입력하세요");
		boolean check=true;
		String stuName = scn.nextLine();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStuName().equals(stuName)) {
				System.out.printf("학생번호 : %s \n이름 : %s \n성별 : %s \n점수 : %d \n", //
						students[i].getStuId(), //
						students[i].getStuName(), //
						students[i].getStuS(), //
						students[i].getStuScore()//
				);
				check=false;
			}
		}
		if(check) {
			System.out.println("조회된 학생이 없습니다.");
		}
	}

	public static void modify() {
		System.out.println("수정할 학생의 번호를 입력하세요");
		boolean check=true;
		String stuId = scn.nextLine();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStuId().equals(stuId)) {
				System.out.print("수정할 점수를 입력하세요");
				int score = Integer.parseInt(scn.nextLine());
				students[i].setStuScore(score);
				System.out.println(students[i].getStuScore() + "점으로 수정되었습니다");
				check=false;
			}
		}
		if(check) {
			System.out.println("조회된 학생이 없습니다.");
		}
	}

	public static void remove() {
		System.out.println("삭제할 학생의 번호를 입력하세요");
		String stuId = scn.nextLine();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStuId().equals(stuId)) {
				students[i] = null;
				System.out.println("삭제되었습니다.");
				break;
			}
		}
	}
}
