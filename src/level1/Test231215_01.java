package level1;

import java.util.Iterator;

public class Test231215_01 {
	public static void main(String[] args) {

//		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
//		String hand = "right";
		String hand = "left";
		String answer = "";

		int left = 10;
		int right = 12;

		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];

			if (num == 1 || num == 4 || num == 7) {
				answer += "L";
				left = num;
			} else if (num == 3 || num == 6 || num == 9) {
				answer += "R";
				right = num;
			} else {
				// int distance = Math.abs((a - 1) / cols - (b - 1) / cols) + Math.abs((a - 1) %
				// cols - (b - 1) % cols);
				// Math.abs(a-b)/3 + Math.abs(a-b)%3
				if (num==0) {
					num = 11;
				}
				int leftdis = Math.abs(left - num) / 3 + Math.abs(left - num) % 3;
				int rightdis = Math.abs(right - num) / 3 + Math.abs(right - num) % 3;

				if (leftdis < rightdis) {
					answer += "L";
					left = num;
				} else if (leftdis > rightdis) {
					answer += "R";
					right = num;
				} else { // 거리가 같을때
					if (hand.equals("left")) {
						answer += "L";
						left = num;
					} else {
						answer += "R";
						right = num;
					}

				}
			}

		} // for i
		System.out.println(answer);
	}
}
