package com.yedam.HomeWork;

import java.util.Scanner;

public class HW0602 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// 1번

//		System.out.println("x입");
//		int x = scn.nextInt();
//		System.out.println("y입");
//		int y = scn.nextInt();
//		
//		if(x > 0 && y> 0) {
//			System.out.println("제1사분면입니다.");
//		} else if( x < 0 && y > 0) {
//			System.out.println("제2사분면");
//		} else if(x<0 && y< 0) {
//			System.out.println("제3사분면");
//		} else if(x>0 && y<0) {
//			System.out.println("제4사분면");
//		}

		// 2번
//		
//		System.out.println("년도를 입력해주세요");
//		int year = scn.nextInt();
//		if(year % 4 == 0) {
//			if(year % 100 != 0 || year % 400 == 0) {
//				System.out.println("윤년입니다.");
//			}
//			}else {
//				System.out.println("윤년이아닙니다.");
//		}

		// 3번
//		System.out.println("가위, 바위 ,보?");
//		String win = scn.nextLine();
//		switch(win) {
//		case "가위":
//			System.out.println("묵을 내세요"); break;
//		case "바위":
//			System.out.println("빠를 내세요"); break;
//		case "보":
//			System.out.println("찌를 내세요");
//		};
//		
		// 4번

//		for (int j = 1; j <= 5; j++) {
//			for (int i = 1; i <= 5; i++) {
//				if(i + j >= 6) {
//					System.out.printf("%s", "*");
//				}else {
//					System.out.printf("%s"," ");
//				}
//			}
//			System.out.println();
//		}

		// 4차 1번
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
//		System.out.println(arr1[5]);

		// 2
//		for(int i = 0; i< arr1.length; i++) {
//			if(arr1[i] != arr1[3]) {
//				System.out.println(arr1[i]);
//			}
//		}
//		
		// 3
//		System.out.println("변경하고싶은 인덱스 번호를 입력하세요");
//		int num = Integer.parseInt(scn.nextLine());
//		arr1[num] = 1000;
//		for(int i = 0; i < arr1.length; i++) {
//		System.out.println(arr1[i]);
//		}

//		int max = arr1[0];
//		for (int i = 0; i < arr1.length; i++) {
//			if (i != 0) {
//				if (max < arr1[i]) {
//					max = arr1[i];
//				}
//			}
//		}
//		System.out.println(max);
//
//		
//		int[] num = new int[10];
//		for(int i = 0; i < num.length; i++) {
//		num[i] = Integer.parseInt(scn.nextLine());
//		}
//		for(int j = 0; j <num.length; j++) {
//			if(num[j] % 3 ==0) {
//				System.out.println(num[j]);
//			}
//		}
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				//작성위치
				System.out.println("학생수를 입력해주세요.");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				//작성위치
				System.out.println("점수를 입력해주세요.");
				for(int i = 0; i < scores.length ; i++) {
					scores[i] = scn.nextInt();
				}
				break;
			case 3:
				//작성위치
				for(int i = 0; i < scores.length; i++) {
				System.out.println(scores[i]);
				}
				break;
			case 4:
				//작성위치
				int sum = 0;
				int cnt = 0;
				for(int i=0; i< scores.length; i++) {
					sum += scores[i];
					cnt += 1;
				}
				double avg= sum/cnt;
				System.out.printf("총점 : %d  평균 : %.1f \n", sum, avg);
				break;
			case 5:
				//작성위치
				run = false;
				System.out.println("종료되었습니다.");
				break;
			}
			
		}
		
	


	} // end of main
}
