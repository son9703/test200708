package today;

import java.util.Scanner;

public class TD0714_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = null;
		double sum = 0; // �հ�
		double avg = 0; // ���
		int i = 0;
		int max = 0;
		boolean run = true;

		do {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.�л��� | 2. �����Է� | 3. ��������Ʈ |4. �м� | 5. ����");
			System.out.println("-------------------------------------------------------");
			System.out.print("���� > ");
			int num1 = sc.nextInt();

			if (num1 == 1) {
				System.out.print("�л��� >");
				int size = sc.nextInt();
				num = new int[size];
			}
			if (num1 == 2) {
				for (i = 0; i < num.length; i++) {
					System.out.print((i + 1) + "�� ° �л����� :");
					num[i] = sc.nextInt();
				}
			}
			if (num1 == 3) {
				for (i = 0; i < num.length; i++) {
					System.out.println((i + 1) + "�� ° �л����� :" + num[i]);
				}
			}
			if (num1 == 4) {
				for (i = 0; i < num.length; i++) {
					if (num[i] > max) {
						max = num[i];
					}
				}
				System.out.println("�ְ����� :" + max);
				for (i = 0; i < num.length; i++) {
					sum = num[i] + sum;
					avg = sum / num.length;
				}
				System.out.println("������� :" + avg);
				System.out.println("�������� ����");
				for (i = 0; i < num.length; i++) {
					for (int j = i + 1; j < num.length; j++) {
						if (num[i] < num[j]) {
							int temp = num[j];// 20
							num[j] = num[i];// 10
							num[i] = temp;// 20
						}
					}
				}
				for (i = 0; i < num.length; i++) {
					System.out.println(num[i]);
				}
			} else if (num1 == 5) {
				System.out.println("�����մϴ�");
				run = false;
			}

		} while (run);

	}

}
