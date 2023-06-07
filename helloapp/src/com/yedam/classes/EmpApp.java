package com.yedam.classes;

// 사원정보를 저장
// 사원클래스(Employee) - 부서클래스(Department).

public class EmpApp {
	public static void main(String[] args) {
		Department dept1 = new Department(10, "인사", 120);
		dept1.setDepartmentId(10);
		dept1.setDepartmentName("인사");
		dept1.setManagerId(120);
		Department dept2 = new Department(20, "기획");

		System.out.println(dept2.toString());

		// 사원.
		Employee emp1 = new Employee();
		emp1.setEmployeeId(200);
		emp1.setFirstName("길동");
		emp1.setLastName("홍");
		emp1.setDept(dept1);

		System.out.println("부서정보: " + emp1.getDept().getDepartmentName());

		Employee emp2 = new Employee(201, "민수", "김", dept1);

		Employee emp3 = new Employee(203, "이수", "김", //
				new Department(30,"개발",150));
		
	}
}