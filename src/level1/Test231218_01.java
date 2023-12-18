package level1;

import java.util.Arrays;

public class Test231218_01 {
	public static void main(String[] args) {

		// stages의 길이 : 인원수 (숫자보다큰 배열만 골라서 >=)
		// 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		// stages 중 1인 배열의 수 / 지나쳐간 플레이어 수
		// 같으면 조건

		int N = 5;
		int[] answer = new int[N];
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };

		double[] failure = new double[N];// 실패율
		int[] failuser = new int[N];// 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
//		int player = 0;// 도달한 사용자수
		int player = stages.length;

		// failuser뱌욜 먼저구해
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] == i + 1) {
					failuser[i] += 1; // failuser(i+1)단계 : 1명
				}
			} // for j
		}

		System.out.println("failuser:" + Arrays.toString(failuser));

		for (int i = 0; i < N; i++) {
			failure[i] = (double) failuser[i] / player;
			player -= failuser[i];
		}
		System.out.println("failure:" + Arrays.toString(failure));

		// 인덱스를 줌
		for (int i = 0; i < N; i++) {
			answer[i] = i + 1;
		}
		System.out.println("인덱스" + Arrays.toString(answer));

		int temp = 0;
		double temp2 = 0;
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N - 1; i++) {
				if (failure[i + 1] > failure[i]) {
					temp2 = failure[i];
					failure[i] = failure[i + 1];
					failure[i + 1] = temp2;

					temp = answer[i];
					answer[i] = answer[i + 1];
					answer[i + 1] = temp;
				}
				System.out.println("2failure:" + Arrays.toString(failure));
				System.out.println(Arrays.toString(answer));
			}
		}

//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < stages.length; j++) {
//				if (stages[j] >= i) {
//					player++;
//				}
//				if (stages[j] == i + 1) {
//					failuser[i] += 1; // failuser1단계 : 1명
//				}
//			} // for j
//
//			failure[i] = failuser[i] / player;
//
//		} // for i

	}

}
