package level1;

import java.util.Arrays;

public class Test240103_01 {
	public static void main(String[] args) {

		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		String[] answer = new String[n];

		int[][] map1 = new int[n][n];
		int[][] map2 = new int[n][n];

		// 이진수로 변환
		for (int i = 0; i < n; i++) {
			answer[i] = "";
			for (int j = 0; j < n; j++) {
				map1[i][n - 1 - j] = arr1[i] % 2; // 맨뒤부터
				map2[i][n - 1 - j] = arr2[i] % 2;
				arr1[i] /= 2;
				arr2[i] /= 2;
			} // for j
		} // for i

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map1[i][j] == 1 || map2[i][j] == 1) {
					answer[i] += "#";
				} else {
					answer[i] += " ";
				}
			}//for j
		}//for i
		
		System.out.println(Arrays.toString(answer));
		// [null#####, null# # #, null### #, null# ##, null#####]?....?
	}

}
