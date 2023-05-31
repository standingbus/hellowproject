package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		//1부터 100까지의 수중에서 3의 배수의 합계. method1()
		// Math.random() 의 2번 실행 => 두 수의 합이 5가되는 경우 ex) 1,4, 2,3   3,2  => 다 출력. Method2()
		// 반복문 for를 활용. 
		//*
		//**
		//***
		//**** .method3()
		method2();
		
	}
	public static void method1() {
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				result += i;
			}
		}
		System.out.println(result);
	} //end of method1
		
	
		
	public static void method2() {
		
			
			while(true) {
				int num1 = (int)(Math.random()*4)+1;
				int num2 = (int)(Math.random()*4)+1;
				int result = num1 + num2;
			if(result == 5) {
				System.out.printf("%d + %d = %d" ,num1, num2, result);
				break;
			} 
			}	
		
	} //end of method2()
			
	public static void method3() {	
	 
		
		for(int i =1; i<=4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i + j >= 5) {
					System.out.printf("%s", "*");
				} else {
					System.out.printf("%s", " ");
				}
			}	
			System.out.println();
		}
			
			
		
		
} //end of method3()
		
}
		


