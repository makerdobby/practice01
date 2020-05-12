package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();

		int length = text.length(); // 길이 구하는 메소드

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(text.charAt(j));
			}
			System.out.print("\n");
		}
		scanner.close();
	}
}