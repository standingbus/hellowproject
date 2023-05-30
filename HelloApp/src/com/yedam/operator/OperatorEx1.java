package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {
	//메소드 : 함수인데 객체(object)에 소속되어있는 것
	public static void main(String[] args) {
		
		
		/*
		 * 사용자의 값을 입력받도록 num1, num2 값을 입력받도록
		 * num1 ~ num2 사이의 값의 합계를 구하는 프로그램 작성.
		 * 짝수만 계산합
		 * 
		 * */
		Scanner scn = new Scanner(System.in);
		
		
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		
		try {
			System.out.println("숫자를 입력하세요.");
			num1 = scn.nextInt();
			System.out.println("숫자를 입력하세요.");
			num2 = scn.nextInt();
			
			for(int i = num1; i<=num2; i++) {
				if (i % 2 == 0){
				result += i;
				}
			};
		} catch(Exception e) {
			System.out.println("숫자가 아닌 값입니다.");
		}
		
		System.out.println("결과값은 " + result + "입니다.");
		scn.close();
		
		
		/*
		int result = 0;
		String str ="";
		// var, let => int, long
		// for(let i =0; i<3; i++){} 자바스크립
		// for(int i = 0; i<3; i++){} 자바
		try {
		  str = scn.nextLine(); // () : 실행 , 함수가 객체에 소속되어있는것을 메소드.
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println("결과값은 " + result + "입니다.");
		
		scn.close(); //resource 환원.
		*/
		
		/*
		for(int i = num1; i<=num2; i++) {
			result += i;
			if( i == num2) {
				System.out.print(i + "=");
			
			} else {
				System.out.print(i + "+");
			}
			
		};
	} catch(Exception e) {
		System.out.println("숫자가 아닌 값입니다.");
	}
	System.out.println(result);
	
	scn.close();
	*/
	}
}
