package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Member[] members = new Member[2];
		for (int i = 0; i < members.length; i++) {
			Member m1 = new Member();
			System.out.print("아이디를 입력하세요");
			String id = scn.nextLine();

			if (i != 0) {
				boolean dupId = false;
				for (int j = 0; j < i; j++) {
					if (members[j].memberId.equals(id)) {
						System.out.println("중복된 아이디 입니다.");
						dupId = true;
						break;
					}
				}
				if (dupId) {
					i--;
					continue;
				}
			}
			m1.memberId = id;
			System.out.print("이름 입력");
			m1.memberName = scn.nextLine();
			System.out.print("포인트 입력");
			m1.point = Integer.parseInt(scn.nextLine());
			members[i] = m1;
		}

		// memberId 조회 후 포인트 변경
		System.out.println("조회할 아이디 입력");
		String searchId = scn.nextLine();
		System.out.println("변경할 포인트를 입력");
		int newPoint = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < members.length; i++) {
			if (members[i].memberId.equals(searchId)) {
				members[i].point = newPoint;
			}
		}

		for (int i = 0; i < members.length; i++) {
			System.out.printf("아이디 : %s, 이름 : %s, point : %d \n", //
					members[i].memberId, //
					members[i].memberName, //
					members[i].point);
		}
		scn.close();
	}
}
