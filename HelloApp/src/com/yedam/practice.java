package com.yedam;
import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	 thirdMethod();
}
	/*
	 * 사용자의 값을 입력받도록 num1, num2 값을 입력받도록
	 * num1 ~ num2 사이의 값의 합계를 구하는 프로그램 작성.
	 * 짝수만 계산합
	 * 
	 * */
	public static void secondMethod() {
	Scanner scn = new Scanner(System.in);
	System.out.println("첫째 값을 입력해주세요");
	int num1 = scn.nextInt();
	System.out.println("두번째 값을 입력");
	int num2 = scn.nextInt();
	int result = 0;
	
	for(int i = num1; i<= num2; i++) {
		result += i;
	}
	System.out.println(result);
	
	}
	// 변수 balance 선언. 
			// balance 가 0~100,000, 범위내에서만 추가, 차감되도록.
			// 입력값을 판단 1) balance 값을 추가. 2) balance 값을 빼기
			// 3) 현재 balance 값을 콘솔출력. 4) 종료.
	
	
	public static void thirdMethod() {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		
		
		while(true) {
			System.out.println("1)추가 2)차감 3)보기 4)나가기");
			int num1 = scn.nextInt();
			if(num1 == 1 ) { 
				int acct = scn.nextInt();
				balance += acct;
			
			} 
			
		}
	}
	
}

