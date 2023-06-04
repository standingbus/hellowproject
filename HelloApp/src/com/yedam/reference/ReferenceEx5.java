package com.yedam.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		
		//int[] intAry = new int[5];
		//intAry[0] = (int) (Math.random() * 100);
		//intAry[1] = (int) (Math.random() * 100);
		//intAry[2] = (int) (Math.random() * 100);
		//intAry[3] = (int) (Math.random() * 100);
		//intAry[4] = (int) (Math.random() * 100);
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		// 제일 큰 수 intAry 의 첫번째 값에 넣고 순서대로 대입
		
		
		
		
		int[] intAry = new int[5];
		intAry[0] = (int) (Math.random() * 100);
		intAry[1] = (int) (Math.random() * 100);
		intAry[2] = (int) (Math.random() * 100);
		intAry[3] = (int) (Math.random() * 100);
		intAry[4] = (int) (Math.random() * 100);
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println();
	for(int j = 0; j < intAry.length - 1; j++) {
		for(int i = 0; i < intAry.length - 1; i++) {
			//i = 0
			int temp = 0; // 원래자리에 있던 값을 다른곳에 저장 해주고 자리를 바꿔줘야함
			if(intAry[i] <intAry[i+1]) {
				temp = intAry[i];
				intAry[i] = intAry[i + 1];
				intAry[i+1] = temp;  
			} 
		}
	} //end of for
	for(int i = 0 ; i < intAry.length; i ++) {
		System.out.println(intAry[i]);
	}
			
		
		
	}
	public static void abc() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// 제일 큰 수 intAry 의 첫번째 값에 넣고 순서대로 대입
	}
	
}

			 
		
			
				
								
			
			
			

