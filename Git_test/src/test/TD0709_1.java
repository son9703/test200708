package test;

import java.util.Scanner;

public class TD0709_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; //�հ�
				
		boolean run = true;
				
		do {
			System.out.println("-----------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------------");
			System.out.print("���� > ");
			int num = sc.nextInt();//���� 			
						
			if(num == 1) {
				System.out.print("���ݾ�>");
				int num2 = sc.nextInt();//�Աݾ�
				sum = sum + num2;
				System.out.println("�ܰ�> �����ܾ���"+ sum + "�Դϴ�");
			}else if(num == 2) {
				System.out.print("��ݾ� > ");
				int num1 = sc.nextInt();//��ݾ�
				if(sum > num1) {
					sum = sum - num1;
					System.out.println("����� ó���Ǿ����ϴ�.");
					System.out.println("�����ܾ��� "+ sum + "�Դϴ�");
				}
				else if(sum < num1) {
					System.out.println("�ܾ��� �����մϴ�");
					System.out.println("�����ܾ��� "+ sum + "�Դϴ�");
				}
			}else if(num == 3) {
				System.out.println("�ܰ�> �����ܾ���"+sum+"�Դϴ�");
			}else if(num == 4) {
				
				run = false;
			}
		}while(run);
		System.out.println("���α׷��� �����մϴ�");

	}

}
