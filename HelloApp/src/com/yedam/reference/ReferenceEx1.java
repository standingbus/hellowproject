package com.yedam.reference;

class Student1{
	String name;
	int age;
	
}


public class ReferenceEx1 {
	public static void main(String[] args) {
		int age = 25;
		double price = 100.5;
		
		int age1 = age;
		age = 30;
		System.out.println("age : " +age + ", age1 : " + age1);
		
		
		String name = new String("홍규연");
		String name1 =new String("김길동");
		name1 = name;
		name = new String("박길동");
//		System.out.println("name : " + name + ", name1 : " + name1);
		String hobby = "독서";
		
		Student1 s1 = new Student1();
		s1.name = "홍길동";
		s1.age = 20;
		
		
		Student1 s2 = s1;
		s1.name = "김길동";
		s1.age = 22;
		System.out.println(s1.name + "," + s2.name);
		
		String name2 = "안영진";
		String name3 = new String("안영진");
		
		//System.out.println(name2 == name3);
		boolean result = name2.equals(name3);
		System.out.println();
	}
}
