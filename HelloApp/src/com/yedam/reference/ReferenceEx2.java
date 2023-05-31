package com.yedam.reference;

public class ReferenceEx2 {
	public static void main(String[] args) {
		//int s1 =90; int s2 = 80; ... int s20 = 90;
		int[] inAry = {30, 40, 50};
		double[] dbAry = {30.0, 40.0, 50.0};
		String[] strAry = {"H", "E", "L", "L", "O"};
		int[] inAry2 = new int[3]; //공간 3개를 만들었다(0,0,0)
		
		
		//배열 크기는 한번 정해지면 불변.
		System.out.println(inAry2[0]);
		inAry2[0] = 33;
		System.out.println(inAry2[0]);
		
		int sum = inAry[0] + inAry[1] + inAry[2];
		for(int i = 0; i < 3; i++) {
			sum += inAry[i];
		}
		// 확장 for
		for(String str : strAry) {
			System.out.println(str);
		}
		System.out.println("sum : " + sum);
		double sum1 = dbAry[0] + dbAry[1] + dbAry[2];
		
	}
}
