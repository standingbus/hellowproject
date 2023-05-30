package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하셈");
		int num1 = scn.nextInt();
		System.out.println("두번째 값 입력:");
		int num2 = scn.nextInt();
		
		thirdMethod(num1, num2);
		
		scn.close();
		
	}		
		
	
	public static void thirdMethod(int a, int b) {
		// 매개로 받은 2개의 수를 더하고 결과를 출력
		
		int result = a + b;
		System.out.println("결과값은 :" + result);
	}
			
	
	
	
	public static void secondMethod() {
	// Scanner 활용.
			// "I am a boy", 3 => 3번 출력하겠다
	Scanner scn = new Scanner(System.in);
	
	System.out.println("출력할 문자를 입력하세요.");
	String text = scn.nextLine();
	System.out.println("숫자를 입력하세요");
	int num2 = scn.nextInt();
	
	for(int i = 1; i <= num2; i++) {
		System.out.println(text);
	}
scn.close();
	}// end of secondMethod

		

		
		
		

	public static void firstMethod() {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1 = scn.nextInt();
		System.out.println("숫자를 입력하세요");
		int num2 = scn.nextInt();
		
		int result = 1 ;
		for (int i =1; i<=num2; i++) {
			result += result * num1;
		}
		System.out.println( result );
		
		scn.close();
	}// end of firstMethod
}
