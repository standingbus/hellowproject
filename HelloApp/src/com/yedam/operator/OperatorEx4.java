package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) throws IOException {
		
		int result = 0;
		
		System.out.println("입력값을 넣어주세요");		
	while(true) {
		result =  System.in.read();
		if(result == 13 || result == 10) {
			
			continue;
		}
		
		
		if(result == 113) {
			break;
		}
		else if(result >=97 && result <= 112) {
			System.out.println("소문자 입니다.");
		} else if(result >=65 && result <= 90) {
			System.out.println("대문자 입니다.");
		} else if (result >= 48 && result <= 57) {
			System.out.println("숫자 입니다.");
		} else {
			System.out.println("기타값 입니다.");
		}
		 System.out.println("입력값을 넣어주세요");
		
	}
	System.out.println("끝");
	}
}
