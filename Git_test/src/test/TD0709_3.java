package test;

import java.util.Scanner;

public class TD0709_3 {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭 �����Ͽ� 
		// ���� �˾Ƽ� �Է��ϰ�
		// �Էµ� ������ ���հ� ����� ���Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		int []num = new int[5];
		int num1 = 0; // ����
		int num2 = 0; // ���
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			num1 = num[i] +num1;
		}
		System.out.println("������ :" + num1);
		num2 = num1/num.length;			
		System.out.println("����� :" + num2);
/////////////�Ǵ� /////////////////////
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
		System.out.println("�հ� :" +sum);
		avg = sum / ber.length;
		System.out.println("��� :" +avg);
	}

}
