package com.yedam.HomeWork;

import java.util.Scanner;

import com.yedam.object.Student;


public class Hw5차 {

	static Scanner scn = new Scanner(System.in);
	static Product p1 = new Product();
	static	Product[] products = null;
	static int prdNu = 0;
	
	public static void size() {
		
		
		System.out.println("몇개의 상품을 등록할까요");
		prdNu = Integer.parseInt(scn.nextLine());
		products = new Product [prdNu];
	}
	
	public static void input() {
		for (int i = 0; i < prdNu; i++) {
			p1 = new Product();
			System.out.println("상품명을 입력해주세요");
			p1.setName(scn.nextLine());
			System.out.println("가격을 입력해주세요");
			p1.setPrice(Integer.parseInt(scn.nextLine()));
			
			products[i] = p1;
		}
	}
	
	public static void list() {
		for(int i = 0; i < products.length; i++) {
			System.out.printf("%s : %d원 \n", products[i].getName(),products[i].getPrice());
		}
	}
	
	public static void ana() {
		int max = 0;
		int sum = 0;
		for(int i = 0; i < products.length; i++) {
			if(max < products[i].getPrice()) {
				max = products[i].getPrice();
			}
		} for(int j = 0; j < products.length; j++ ) {
		if(products[j].getPrice() != max) {
			sum += products[j].getPrice();
		}
		} 
		System.out.printf("최고 가격 : %d 최고가격을 제외한 제품들의 가격 합 : %d \n", max, sum);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		boolean run = true;	
		
		
		
		
		
		while (run) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				size();
			} else if (selectNo == 2) {
				input();
			} else if (selectNo == 3) {
				
			} else if (selectNo == 4) {
				
				
			} else if (selectNo == 5) {
				run = false;
				System.out.println("종료띠");
			}
		}
	}
}
