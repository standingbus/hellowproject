package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {
//		//학생3명: 홍길동의 영어, 수학: 안영진: 안철수:
		int[][] intAry = {
			new int[] {80,90}, // 홍길동의 영어
			new int[] {85, 95}, //안영진의 영어
			new int[] {70, 80}, //안철수의 영어
		};
		
		String[] nameAry = {"홍길동", "김길동", "박길동" };
		
		
		// 이름을 입력받아 그 학생의 점수를 보여주시오 없다면 없다고 나오도록 출력하셈
		
		
		
//		// intAry[0] = 20; 타입이 다르니 에러
//		System.out.printf("김길동의 수학점수 %d \n", intAry[1][1]);
//		int engSum = 0;
//		int mathSum = 0;
//		//engSum = intAry[0][0] + intAry[1][0] + intAry[2][0];
//		for(int i=0; i<intAry.length; i++) {
//			engSum += intAry[i][0];
//			mathSum += intAry[i][1];
//		}
//		
//		int total = 0;
//		for(int i = 0; i < intAry.length; i++) {
//			for(int j = 0; j < intAry.length-1; j++) {
//				total += intAry[i][j];
//			}
//		}
//		System.out.printf("영어점수의 합은 %d \n",engSum);
//		System.out.printf("수학점수의 합은 %d \n", mathSum);
//		
//		
//		System.out.printf("전과목 합은 %d \n", total);
		
		
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("학생이름 :");
		String searchName = scn.nextLine();
		String no = "";

		for(int i = 0 ; i < nameAry.length; i++) {
		
		if(nameAry[i].equals(searchName)) {
		System.out.printf("%s의 영어점수 : %d 수학점수 : %d \n", searchName,intAry[i][0], intAry[i][1] );
			no += searchName;
			}
		}
		 if(no == "") {
				System.out.println("찾는거없음");
			}
		System.out.println("end of prog");
		scn.close();
		
		
		
		
//		for(int i = 0; i< nameAry.length; i++) {
//		System.out.printf("%s의 영어점수 : %d, 수학점수 : %d \n", nameAry[i], intAry[i][0], intAry[i][1]);
//		}
//		for(int i = 0; i < nameAry.length; i++) {
//			for(int j = 0; j < intAry.length; j++) {
//				for(int k = 0; k < intAry.length; j++) {
//					
//				}
			}
		
		
		
		
		
		
		
		
		
		
		
	}// end of main();
