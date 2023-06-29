package com.kalai.jenkins;

public class Student {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		Student s1 = new Student(109, "kalai");
		Student s2 = new Student(110, "Nindhuja");
		Student s3 = new Student(1100, "duplicate");
		s1.display();
		s2.display();
		s3.display();
	}
}
