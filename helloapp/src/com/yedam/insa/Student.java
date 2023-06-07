package com.yedam.insa;

public class Student {
	private String stdNo;
	private String name;
	private int score;
	//private String gender; // 남/여
	private Gender gender;

	public Student(String stdNo, String name, int score, Gender gender) {
		super();
		this.stdNo = stdNo;
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getStdNo() {
		return stdNo;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Gender getGender() {
		return gender;
	}
}
