package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3];
		Bank b1 = new Bank();
		
		accounts =new Bank[] {};
		
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		while(run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			int selecnu= Integer.parseInt(scn.nextLine());
			
			if(selecnu == 1) {
				for(int i =0; i < accounts.length; i++) {
				System.out.println("계좌를 입력해주세요");
				b1.accountNO = scn.nextLine();
				System.out.println("이름을 입력해주세요");
				b1.owner = scn.nextLine();
				System.out.println("생성시 1000원 입금해야함");
				b1.balance = Integer.parseInt(scn.nextLine());
				}
			} else if(selecnu == 2) {
				for(int i = 0; i<accounts.length; i++) {
					System.out.printf("계좌 : %s, 예금주 : %s, 금액 : %d \n", 
							accounts[i].accountNO, 
							accounts[i].owner, 
							accounts[i].balance);
				}
			}else if(selecnu == 3) {
				System.out.println("입금할 금액을 입력해주세요");
				b1.balance += Integer.parseInt(scn.nextLine());
			}else if(selecnu == 4) {
				System.out.println("출금할 금액을 입력해주세요");
				b1.balance -= Integer.parseInt(scn.nextLine());
			}else if(selecnu == 5) {
				run = false;
			}
			
			
		}
			
		System.out.println("end of prog");	
			
		
	}
}
