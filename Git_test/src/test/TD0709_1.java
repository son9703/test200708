package test;

import java.util.Scanner;

public class TD0709_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; //합계
				
		boolean run = true;
				
		do {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 > ");
			int num = sc.nextInt();//선택 			
						
			if(num == 1) {
				System.out.print("예금액>");
				int num2 = sc.nextInt();//입금액
				sum = sum + num2;
				System.out.println("잔고> 현재잔액은"+ sum + "입니다");
			}else if(num == 2) {
				System.out.print("출금액 > ");
				int num1 = sc.nextInt();//출금액
				if(sum > num1) {
					sum = sum - num1;
					System.out.println("출금이 처리되었습니다.");
					System.out.println("현재잔액은 "+ sum + "입니다");
				}
				else if(sum < num1) {
					System.out.println("잔액이 부족합니다");
					System.out.println("현재잔액은 "+ sum + "입니다");
				}
			}else if(num == 3) {
				System.out.println("잔고> 현재잔액은"+sum+"입니다");
			}else if(num == 4) {
				
				run = false;
			}
		}while(run);
		System.out.println("프로그램을 종료합니다");

	}

}
