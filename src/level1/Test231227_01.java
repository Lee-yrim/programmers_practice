package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test231227_01 {
	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			ArrayList<Integer> arr = new ArrayList<>();

			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				arr.add(array[j]);//
			}

			Collections.sort(arr);

			answer[i] = arr.get(commands[i][2] - 1);
		}
		System.out.println(Arrays.toString(answer));
	}

}
