package test;

import java.util.Scanner;

public class TD0709_3 {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열 선언하여 
		// 값을 알아서 입력하고
		// 입력된 값들의 총합과 평균을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		int []num = new int[5];
		int num1 = 0; // 총합
		int num2 = 0; // 평균
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			num1 = num[i] +num1;
		}
		System.out.println("총합은 :" + num1);
		num2 = num1/num.length;			
		System.out.println("평균은 :" + num2);
/////////////또는 /////////////////////
		int []ber = new int[5];
		ber[0] = 70;
		ber[1] = 70;
		ber[2] = 70;
		ber[3] = 70;
		ber[4] = 70;
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < ber.length; i++) {
			sum = ber[i] + sum;
		}
		System.out.println("합계 :" +sum);
		avg = sum / ber.length;
		System.out.println("평균 :" +avg);
	}

}
