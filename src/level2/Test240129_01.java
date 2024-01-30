package level2;

import java.util.Arrays;

//JadenCase 문자열 만들기
public class Test240129_01 {
	public static void main(String[] args) {

		// toUpper사용

//		String s="3people unFollowed me";
//		String s = "  4for the last   week";
		String s = "  for the what 1what  ";
		String answer = "";

		String[] arr = s.split("\\ ");// " +"
//		String[] arr = s.split(",");// " +"
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
//			char c=arr[i].charAt(0);
			if (arr[i].length() == 0) {
				answer += " ";
			}

			if (arr[i].length() != 0) {
				answer += arr[i].substring(0, 1).toUpperCase();
				answer += arr[i].substring(1, arr[i].length()).toLowerCase();
				// 공백
				answer += " ";
			}

		}


		answer = answer.substring(0, answer.length() - 1);
//		System.out.println(answer + "k");

	}

}
