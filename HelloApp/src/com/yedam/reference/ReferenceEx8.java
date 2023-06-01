package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수 입력. 점수출력, 최고점수, 평균점수.
		
		Scanner scn = new Scanner(System.in);
		int studentNum = 0; // 학생수 지정.
		int[] scores = null; //score = new int[3]
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석(최고점, 평균) 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			if(selectNo == 1) {
				System.out.println("학생수 입력 ㄱ");
				 studentNum += Integer.parseInt(scn.nextLine());
				 scores = new int[studentNum];
				
			} else if(selectNo == 2) {				//배열의 크기만큼 학생의 점수
				if(scores == null) {
					System.out.println("***다시 입력하세요 *****");
					continue;
				}
				System.out.println("점수 입력 ㄱ");
				for(int i = 0; i < scores.length; i++) {
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			}  else if(selectNo == 3) {				//배열의 점수 출력
				if(scores == null) {
					System.out.println("***다시 입력하세요 *****");
					continue;
				}
				for(int i = 0 ; i < scores.length; i++)
					System.out.println(scores[i]);
			} else if(selectNo == 4) {				//분석 : 최고, 평균
				if(scores == null) {
					System.out.println("***다시 입력하세요 *****");
					continue;
				}
				int max = 0;
				int cnt = 0;
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				} for(int i = 0; i< scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("최고점은 %d 평균은 %d \n", max,(sum/studentNum));
				
				
			} else if(selectNo == 5) {				//종료 : 프로그램 종료
				run = false;
			}else {
				System.out.println("옳바른 값을 넣어주세요");
			}
			
		}
		System.out.println("끝");
	}//end of main
}
				
					
					
			
				

