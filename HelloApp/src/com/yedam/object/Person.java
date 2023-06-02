package com.yedam.object;

public class Person{
	
	//클래스의 속성: 필드.
	private String name;
	private int age;
	
	//클래스 필드의 초기값을 지정: 생성자.
	//person() : 매개값이 없는 생성자를 기본생성자.
	Person(){
		name = "기본값";
		age = 10;
		
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//클래스의 기능: 메소드.    실행하는 기능임
	void setName(String name){
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	void setAge(int age) {
		if(age<0) {
			this.age = 10;
		} else {
			this.age =age;
		}
	}
	int getAge() {
		return this.age;
	}
	
	void showInfo() {
		System.out.printf("이름은 %s이고 나이는 %d입니다.\n", name, age);
	}
	
	void yearAfter(int year) {
		System.out.printf("이름은 %s이고 내년에는 %d입니다.\n", name, age+year);
	}
} //end of Person