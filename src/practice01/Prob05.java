package practice01;

public class Prob05 {

	public static void main(String[] args) {
		// 3,6,9

		for (int i = 1; i <= 100; i++) {
			// 숫자를 문자취급하기
			String num = String.valueOf(i);

			// 문자 안에 3이나 6이나 9가 들어있나 확인
			int clapCount = 0;
			int length = num.length();
			for (int j = 0; j < length; j++) {
				char c = num.charAt(j);
				// clapCount 세기
				if (c == '3' || c == '6' || c == '9') {
					clapCount++;
				}
			}

			if (clapCount > 0) {
				System.out.print(i);

				for (int k = 0; k < clapCount; k++) {
					System.out.print("짝");
				}
				System.out.print("\n");
			} else {
				continue;
			}

		}
	}
}
