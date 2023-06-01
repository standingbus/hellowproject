package com.yedam.reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		// 학교의 키. a반(2), b반(4), c반(3)
		double[][] heightAry = {//
				{173.7, 168.3},	// a반
				{176.5, 188.3, 190.1, 171.0}, //b반
				{163.9, 190.1, 202.2}, //c반
		};
		// 각 반별로 키의 평균을 출력하라
		System.out.println(heightAry.length);
		
		
		
		
		for(int i = 0 ; i < heightAry.length; i++) {
			double sum = 0;
			for(int j = 0; j <heightAry[i].length; j++) {
				sum += heightAry[i][j];
			}
			System.out.printf("%d반의 평균키 : %.1f \n", i+1, (sum / heightAry[i].length));
		}
		
	}
}
