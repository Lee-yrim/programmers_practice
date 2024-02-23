package level2;
//n진수 게임

import java.util.ArrayList;

public class Test240219_02 {
	public static void main(String[] args) {

//		int n = 2, t = 4, m = 2, p = 1;
//		int n = 16, t = 16, m = 2, p = 1;
		int n = 16, t = 16, m = 2, p = 2;
		// 진법 n, 미리 구할 숫자의 갯수 t, 게임에 참가하는 인원 m, 튜브의 순서 p

		String answer = "";

		ArrayList<String> arr = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < m * t; i++) {
			arr.add(Integer.toString(i, n).toUpperCase());
		}
		System.out.println("arr  "+arr);

		for (int i = 0; i < arr.size(); i++) {
			int idx = 0;
			for (int j =0; j < arr.get(i).length(); j++) {
				if (arr.get(i).length() != 1) {
					arr2.add(arr.get(i).substring(idx, idx + 1));
					idx++;
				} else {
					arr2.add(arr.get(i));
				}
			}
		}
		System.out.println(arr2);

		for (int i = p - 1; i < arr.size(); i += m) {
			result.add(arr2.get(i));
		}
		System.out.println("result: " + result);

		for (int i = 0; i < result.size(); i++) {
			answer += result.get(i).toString();
		}
		System.out.println(answer);
	}

}
