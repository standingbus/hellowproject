package com.yedam.control;

public class ControlEx3 {
	public static void main(String[] args) {
		
		method2();
//		int month = 6;
//		String title = "===" + month + "월 달력===" ;
//		System.out.println(title);
//			
//		String days = "Sun Mon Tue Wed Thr Fri Sat";
//		System.out.println(days);
//		System.out.println("===========================");
//		
//		
//		for (int i = 0; i < getFirstDate(month); i++) {
//			System.out.printf("%3s ", "");
//		}
//		for (int day = 1; day <= getLastDate(month); day++) {
//			System.out.printf("%3d ", day);
//			
//			if((getFirstDate(month) + day)  % 7 == 0) {
//				System.out.println();
//			}
//		}
//		
//		/*
//		System.out.printf("%15s ","");
//		for (int day = 1; day <= 30; day ++) {
//			System.out.printf("%3d ", day);
//			if(day % 7 == 3) {
//				System.out.println();
//			}
//			*/
//		
//		System.out.println();
//		System.out.println("===========================");		
	}	
	
		
	// 4, 5, 6월달 달력 switch ~ case 구문.
	public static int getFirstDate(int month) {
		int result = 0;
		switch(month) {
		case 4 :
			result = 6; break;
		case 5 :
			result = 1; break;
		case 6 :
			result = 3;
		}
		return result;
	}
	
	public static int getLastDate(int month) {
		int result = 0;
		switch(month) {
		case 4 :
			result = 30; break;
		case 5 :
			result = 31; break;
		case 6 :
			result = 30;
		}
		return result;
	}
	
		
		
		
public static void method2() {		
		for(int i = 1; i<=9; i++) {
			for (int b = 2; b <= 9; b++) {
				System.out.printf("%d * %d = %d ", b , i , b*i);
			}
			System.out.println();
		}
	}		//end of method 2
		
		
	
		
		
		
		
		
		
		
public static void method1() {		
		//반복문 : for, while, do ~ while
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) 
			System.out.printf
			("i의 값은 %d \n", i);
			else
				System.out.println("짝수입니다.");
		
	}
	} //end of method1
}
