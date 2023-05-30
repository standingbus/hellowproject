package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
		
		// 변수 balance 선언. 
		// 입력값을 판단 1) balance 값을 추가. 2) balance 값을 빼기
		// 3) 현재 balance 값을 콘솔출력. 4) 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			System.out.println("1)추가 2)차감 3)balance 출력 4)종료");
			int menu = scn.nextInt();
			
			if(menu == 4) {
				System.out.println("종료합니다.");
				break;
			} else if(menu == 1) {
				balance += 100;
			} else if (menu == 2) {
				balance -= 50;
			} else if (menu ==3) {
				System.out.println(balance);
			}
		}
		System.out.println("end of prog.");
	}
	public static void method1() {
		// 반복처리. while (condition) {}
		int num1 = 1;
		
//		while(num1 <= 10) {
//			System.out.println(num1++);
//		}
		
		boolean isOK = false;
		isOK = true;
		num1 = 1;
		while(isOK) {
			System.out.println(num1++);
			if(num1 >= 10)
				isOK = false;
		}
		
		Scanner scn = new Scanner(System.in);
		//quit 구문을 입력하면 반복종료
		isOK = true;
		while(isOK) {
			System.out.println("문장을 입력하세요.");
			String str = scn.nextLine();
			
			if(str.equals("quit")) {
//				isOK = false;
				break; //while 탈출
			}
			System.out.println("입력값은 " + str + "입니다.");
			
		}
		
		System.out.println("end of prog.");
		scn.close();
}
}
