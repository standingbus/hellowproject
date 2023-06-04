package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Member[] members = new Member[1];
		
		
		//등록
		for(int i = 0; i<members.length; i++) {
		Member m1 = new Member();
		System.out.println("아이디를 입력하세요");
		//m1.memberId = scn.nextLine();
		String id = scn.nextLine();
		// i => 0이면 처음등록.
		// i != 0 이면 2번째 등록 1 비교.
//		if(i == 0) {
//			m1.memberId= id;
//		} else if(i >= 1){
//			for(int j = 0; j< members.length; j++) {
//			if(members[j].memberId.equals(id)) {
//				System.out.println("같은 값이 있음");
//				i--;
//				continue;
//			}
//			}
//			m1.memberId =id;
//		}
		
		if(i!=0) {
			boolean dupId = false; //중복된 아이디를 체크하기위해 선언
			for(int j=0; j<i; j++) {
				if (members[j].memberId.equals(id)) {
					dupId = true; //중복된 아이디임을 확인
					break; //중복여부 확인했으면  다음순번 볼 필요없음
				}
			}
			if(dupId) {
				System.out.println("ㄴㄴ");
				i--;
				continue;
			}
		}
		m1.memberId =id;
		
		
		System.out.println("이름을 입력하세요");
		m1.memberName = scn.nextLine();
		System.out.println("포인트를 입력하세요");
		m1.point = Integer.parseInt(scn.nextLine());
		
		members[i] = m1;
		}
		for(int i = 0; i<members.length; i++) {
			System.out.printf("아이디는 : %s, 이름은 : %s, point는 : %d \n", 
					members[i].memberId, 
					members[i].memberName, 
					members[i].point);
			
		}
		
		
		
		
		
		
		//memberId 조회ㅣ 후 point를 변경. 
		System.out.println("조회할 아이디를 입력하세요");
		String searchId = scn.nextLine();
		System.out.println(" 변경할 point를 입력하세요");
		int newpoint = Integer.parseInt(scn.nextLine());
		
		for(int i = 0; i < members.length; i++) {
			if(members[i].memberId.equals(searchId)) {
				members[i].point = newpoint;
//				System.out.println("변경된 값: " + members[i].point);
			}
		}
		
		//출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
