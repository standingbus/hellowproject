package com.yedam.reference;

public class ReferebceEx3 {
	public static void main(String[] args) {
		//학생점수 : 89.5, 78.9, 90.4 값을 저장. sum , avg구해라
		
		
		double[] scr = {89.5, 78.9, 90.4}; 
		scr = new double[] {55.5, 32.6, 77.7, 88.8};
		double maxVal = 0;
		double minVal = 100;
		
		double sum = 0;
		int cnt = 0;
		
		for(double score : scr) {

			maxVal = score;
			minVal = score;

			
			if(maxVal < score) {
				maxVal = score;
			}
			if(minVal > score) {
				minVal = score;
			}
			sum += score;
			cnt++;
		}

		for(int i = 0; i<= scr.length-1; i++) {				
			if(maxVal < scr[i]) {
				maxVal = scr[i];
			} else if(minVal > scr[i]) {
				minVal = scr[i];
		

		double avg = sum/cnt;
		System.out.printf("합계는 %.2f, 평균은 %.2f 최고점은 %.1f, 최저점은 %.1f 입니다. ",sum, avg, maxVal, minVal);
		
			}
		}
	}
}