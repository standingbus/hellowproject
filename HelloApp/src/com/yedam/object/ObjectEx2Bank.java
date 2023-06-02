package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {

	static Scanner scn = new Scanner(System.in);
	static Bank[] accounts = new Bank[3];
	static Bank account = new Bank();

	// 조회계좌 정보 유무
	public static boolean checkAccount(String accountNO) {
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNO)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}

	// 계좌 등록기능
	public static void registerAccount() {
		for (int i = 0; i < accounts.length; i++) {
			Bank b1 = new Bank();
			System.out.println("계좌를 입력해주세요");
			b1.setAccountNO(scn.nextLine());

			if (i != 0) {
				boolean abc = false;
				for (int j = 0; j < i; j++) {
					if (accounts[j].getAccountNo().equals(b1.getAccountNo())) {
						abc = true;
						System.out.println("같은 계좌가 있습니다.");
						break;
					}
				}

				if (abc) {
					i--;
					continue;
				}

			}
			System.out.println("이름을 입력해주세요");
			b1.setOwner(scn.nextLine());
			System.out.println("생성시 1000원 입금해야함");
			b1.setBalance(Integer.parseInt(scn.nextLine()));

			accounts[i] = b1;
		}

	}

	// 계좌 조회
	public static void searchAccount() {
		for (int i = 0; i < accounts.length; i++) {
			System.out.printf("계좌 : %s, 예금주 : %s, 금액 : %d \n", accounts[i].getAccountNo(), accounts[i].getOwner(),
					accounts[i].balance);
		}
	}

	// 입금
	public static void deposit() {
		System.out.println("입금할 계좌를 입력해주세요");
		String acc = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNo().equals(acc)) {
				System.out.println("입금할 금액을 입력해주세요");
				accounts[i].setBalance(accounts[i].getBalance() + Integer.parseInt(scn.nextLine()));
			}
		}

		boolean isTrue = checkAccount(acc); // true or false
		if (!isTrue) {
			System.out.println("없는계좌입니다.");
			return;
		}
	}

	// 출금
	public static void withrow() {
		System.out.println("출금할 계좌를 입력해주세요");
		String acc = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNo().equals(acc)) {
				System.out.println("출금할 금액을 입력해주세요");
				accounts[i].setBalance(accounts[i].getBalance() - Integer.parseInt(scn.nextLine()));
			}
			//계좌 삭제
			
		}
		
	}

	public static void removeAccount() {
		System.out.println("삭제할 계좌번호입력 >");
		String account = scn.nextLine();
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(account)) {
				accounts[i] = null;
				System.out.println("정상적으로 삭제되었습니다.");
				break;
			}
		}
	} //end of removeAccount
	public static void main(String[] args) {

//		b1.setAccountNO("11-11");
//		b1.setOwner("홍길동");
//		b1.setBalance(10000);

		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.삭제 6.종료");
			int selecnu = Integer.parseInt(scn.nextLine());

			if (selecnu == 1) {

				registerAccount();

			} else if (selecnu == 2) {
				searchAccount();

			} else if (selecnu == 3) {
				deposit();
			} else if (selecnu == 4) {
				withrow();
			} else if (selecnu == 5) {
				removeAccount();
			} else if (selecnu == 6) {
				run = false;
			}

		}

		System.out.println("end of prog");

	}
}
