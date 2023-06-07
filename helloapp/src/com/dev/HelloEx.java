package com.dev;

public class HelloEx {
	public static void main(String[] args) {
		com.dev.emp.Hello hello1 = new com.dev.emp.Hello();
//		hello1.name = "Hong"; // private =  클래스 내에서 접근가능.
//		hello1.age = 20; // default = 동일한 패키지내에서 접근가능.
		hello1.height = 123.4; // public =  접근가능.

	}
}
