package com.yedam.reference;

import java.util.Scanner;

//학생 : (String)이름,  (int) 수학, 영어.
class Student {
	String name; // 속성
	int engScore;
	int mathScore;
}
public class ReferenceEx9 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.engScore = 90;
		s1.mathScore = 96;
		
		Student s2 = new Student();
		s2.name = "안철수";
		s2.engScore = 86;
		s2.mathScore = 77;
		
		Student s3 = new Student();
		s3.name = "김길동";
		s3.engScore = 75;
		s3.mathScore = 95;
		
		Student[] students = {s1, s2, s3};
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String sName = scn.nextLine();
		String no = "";
		
		boolean run = true;
		for (int i= 0; i < students.length; i++) {
			if(students[i].name.equals(sName)) {
		System.out.println(students[i].name);
		System.out.println(students[i].engScore);
		System.out.println(students[i].mathScore);
		System.out.println("=========================");
			}
		}
		if(run == true) {
			System.out.println("다시 입력하세요");
		}
		System.out.println("end of prog");
		scn.close();
	}
}
		
		

