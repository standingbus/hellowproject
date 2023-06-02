package com.yedam.object;

import java.util.Scanner;

public class ObjectEx6StudentApp {
	// 학생정보관리 App.
	// 1.등록 2.목록 3.조회(이름) 4.수정 5.삭제 6.종료
	// 학생정보: 학생번호(23-001)/이름/성별(남,여)/점수

	// 1.register(), 2.list(), 3.search() 4.modify 5.remove()
	// 2.남-1명, 여-2명, 최고점수 : 이름-100점

	static Scanner scn = new Scanner(System.in);
	static Student[] students = new Student[3];
	static Student stdinfo = new Student();

	// 학생 정보 등록
	public static void register() {
		System.out.println("학생번호, 이름, 성별, 점수를 입력하세요");
		for (int i = 0; i < students.length; i++) {
			Student s1 = new Student();
			System.out.println("학생번호를 입력하세요");
			s1.setStudentNu(scn.nextLine());
			// 번호 중복 유무

			if (i != 0) {
				boolean err = false;
				for (int j = 0; j < i; j++) {
					if (students[j].getStudentNu().equals(s1.getStudentNu())) {
						System.out.println("같은 번호가 있습니다.");
						err = true;
						break;
					}
				}
				if (err) {
					i--;
					continue;

				}
			}

			System.out.println("학생이름을 입력하세요");
			s1.setName(scn.nextLine());
			System.out.println("성별을 입력하세요");
			s1.setSex(scn.nextLine());
			System.out.println("점수를 입력하세요");
			s1.setScore(Integer.parseInt(scn.nextLine()));
			System.out.println("등록되었습니다.");
			students[i] = s1;
		}
	}

	// 학생 정보 출력
	public static void list() {
		int nun = 0;
		int nam = 0, mScore = 0;
		String mName = "";
		for (int i = 0; i < students.length; i++) {

			if (students[i] == null) {
				continue;
			}
			System.out.printf("번호 : %s, 이름 : %s, 성별 : %s, 점수 : %d \n", students[i].getStudentNu(),
					students[i].getName(), students[i].getSex(), students[i].getScore());
			if (students[i].getSex().equals("남")) {
				nam += 1;
			} else {
				nun += 1;
			}
			if (mScore < students[i].getScore()) {
				mScore = students[i].getScore();
				mName = students[i].getName();
			}
		}
		System.out.println("=========================");
		System.out.printf("남자 : %d, 여자 : %d, 최고점수: %s - %d \n", nam, nun, mName, mScore);
		System.out.println("=========================");
				
	}

	// 학생 검색
	public static void search() {
		System.out.println("확인할 학생번호를 입력해주세요");
		String checkNu = scn.nextLine();
		boolean ab = true;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudentNu().equals(checkNu)) {
				System.out.printf("번호 : %s, 이름 : %s, 성별 : %s, 점수 : %d \n", students[i].getStudentNu(),
						students[i].getName(), students[i].getSex(), students[i].getScore());
				ab = false;
				break;
			}
		}
		if (ab) {
			System.out.println("없는값입니다. 다시 입력해주세요");
		}
	}

	// 정보 수정
	public static void modify() {
		System.out.println("수정할 학생번호를 입력해주세요");
		String modNu = scn.nextLine();

		boolean cha = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudentNu().equals(modNu)) {
				System.out.println("점수를 입력해주세요");
				students[i].setScore(Integer.parseInt(scn.nextLine()));
				cha = true;
				break;
			}
		}
		if (cha) {
			System.out.println("정상적으로 수정되었습니다.");
		} else {
			System.out.println("없는값입니다.");
		}
	}

	// 정보 삭제
	public static void remove() {
		System.out.println("삭제할 학생번호를 입력해주세요");
		String delNu = scn.nextLine();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getStudentNu().equals(delNu)) {
				students[i] = null;
				System.out.println("정상으로 삭제되었습니다.");
				break;
			}

		}

	}

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.목록 3.조회(이름) 4.수정 5.삭제 6.종료");
			int selectno = Integer.parseInt(scn.nextLine());

			if (selectno == 1) {
				register();
			} else if (selectno == 2) {
				list();
			} else if (selectno == 3) {
				search();
			} else if (selectno == 4) {
				modify();
			} else if (selectno == 5) {
				remove();
			} else if (selectno == 6) {
				run = false;
				System.out.println("종료쓰");
			}
		} // end of while

	} // end of main

}
