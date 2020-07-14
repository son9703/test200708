package today;

import java.util.Scanner;

public class TD0714_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = null;
		double sum = 0; // 합계
		double avg = 0; // 평균
		int i = 0;
		int max = 0;
		boolean run = true;

		do {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 |4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");
			int num1 = sc.nextInt();

			if (num1 == 1) {
				System.out.print("학생수 >");
				int size = sc.nextInt();
				num = new int[size];
			}
			if (num1 == 2) {
				for (i = 0; i < num.length; i++) {
					System.out.print((i + 1) + "번 째 학생점수 :");
					num[i] = sc.nextInt();
				}
			}
			if (num1 == 3) {
				for (i = 0; i < num.length; i++) {
					System.out.println((i + 1) + "번 째 학생점수 :" + num[i]);
				}
			}
			if (num1 == 4) {
				for (i = 0; i < num.length; i++) {
					if (num[i] > max) {
						max = num[i];
					}
				}
				System.out.println("최고점수 :" + max);
				for (i = 0; i < num.length; i++) {
					sum = num[i] + sum;
					avg = sum / num.length;
				}
				System.out.println("평균점수 :" + avg);
				System.out.println("내림차순 정렬");
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
				System.out.println("종료합니다");
				run = false;
			}

		} while (run);

	}

}
