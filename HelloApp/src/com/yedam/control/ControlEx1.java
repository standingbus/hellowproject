package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		//0~1 사이의 임의의 수를 생성.
		// 3.45454534 => 3
		// 0~9 => 1~10
		/*
		int result = (int) (Math.random() * 10) + 1 ;
		System.out.println(result);
		if (result % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		*/
		while(true) {
			int result = (int) (Math.random() * 91) +10;
			System.out.println(result);
			if(result == 100) {
				break;
			}
		}
		
		
		//Math.random 을 활용해서 10 ~ 100 까지의 임의의 수.
		//생성된 값이 100 ~ 90 A출력.
		// 80~ 89 : B
		// 70 ~ 79 : C , 그외에는 D출력
		int result1 = (int)(Math.random() * 91)+10;
		String msg ="";
		System.out.println(result1);
		if (result1 >= 90) {
			msg = "A";
		} else if (result1 >= 80) {
			msg = "B";
		} else if (result1 >= 70) {
			msg = "C";
		} else {
			msg = "D";
		}
		System.out.printf("점수는 %d, 등급은 %S 입니다." , result1, msg);
		
	}
	
	
	
}
