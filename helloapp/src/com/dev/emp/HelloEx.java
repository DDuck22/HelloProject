package com.dev.emp;

public class HelloEx {
	public static void main(String[] args) {
		
		for(String str : args) {
			System.out.println(str);
		}
		
		Hello hello = new Hello();
//		hello.name = "name"; // private > set이용해서 생성가능
		hello.age = 20; // default 동일한 패키지 내에서 접근가능.
		hello.height = 132.2;
		
		World world = new World();
		
		System.out.println("end");
	}
}
