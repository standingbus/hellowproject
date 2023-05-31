package com.yedam.control;

import java.util.Scanner;

public class ControlEx2 {
	public static void main(String[] args) {
		Scanner  scn = new Scanner(System.in);
		System.out.println("몇월을 볼까요?");
		int month = scn.nextInt();
		// 12월
		// 메소드 ...마지막 날짜값 : 1 => 31, 2=>28, 3 => 31, 4 => 30
		System.out.println(month +"월의 일수는 "+  getLastDate(month) + "일 입니다." );
	}
	public static int getLastDate(int month) {
		int result = 0;
		switch(month) {
		case 2:
			result =28;break;
		case 4,6,9,11:
			result = 30;break;
		default:
			result = 31;
		}
		
		return result;
	}
		
	public static void method1() {
		// 나온 조건의 case 아래있는 값 다 나오게 해줌 아니면 break 걸어야함
		int result = (int) (Math.random() * 3) + 1;
		switch(result) {
		case 1: 
			System.out.println("가위"); break;
		case 2:
			System.out.println("바위"); break;
		case 3:
			System.out.println("보");
		}
		}

	public static void method2() {
		int result = (int) (Math.random() * 91)+10;
		switch(result/10) {
		case 10:
			System.out.println("A++"); break;
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		default:
			System.out.println("D");
		}
		
		
		System.out.println("end of prog");
	}

}