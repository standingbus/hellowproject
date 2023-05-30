package com.yedam.variable;

public class variableEx1 {
	public static void main(String[] args) {
		
	int num1;
	num1 =100;
	num1 = -100;
	
	double num2 = -1.2;
	num2 = 12.3;
	num2 = 123.0;  //정수 -> 실수 내부적으로 형변환
	
	double result = 0;
	result = (double) num1 + num2; // 변수의 범위 int < double
	System.out.println("결과값 : " + result);
	
	//변수의 종류.
	// 정수 : byte (1byte), short(2byte), int (4byte), long(8byte)
	// 실수 : float(4byte), double(8byte)
	// bool : true/ false
	// 객체(클래스): 문자형 (String)
	// byte : 8bit -> 2*2*2*2*2*2*2*2 : -128 ~ 127
	System.out.println(Integer.MAX_VALUE); // -2147483648 ~ 2147483648
	byte b1 = 127;
	short s1 = 128;
	long l1 = 2147483648L; //정수의 기준 int
	//자바에서 정수연산을 하면 기준이 int.
	long result1 = (long) b1 + (long) s1 + l1; //왼쪽과 오른쪽의 타입이 같아야하고 계산식 에선 가장 큰 범위의 타입을 기준으로 정한다
	
	b1++; // b1 = b1 + 1;
	System.out.println("b1의 값: " + b1);
 	}
}
