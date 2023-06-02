package com.yedam.object;


public class ObjectEx3 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동",20);
//		p1.name = "홍길동";
//		p1.age = 20;
//		p1.age = -20;
//		p1.setName("홍길동");
//		p1.setAge(20);
//		System.out.println(p1.getName() + ", " + p1.getAge());
		p1.showInfo();
		p1.yearAfter(5);
	}
}
