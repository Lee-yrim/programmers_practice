package level1;
//문자열 내마음대로 정렬하기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test240129_02 {
	public static void main(String[] args) {

//		String[] strings = { "sun", "bed", "car" };
		String[] strings = { "abce", "abcd", "cdx"};
//		int n = 1;
		int n = 2;
		String[] answer = new String[strings.length];

		// charAt써서 뽑아내고 정렬,,,해시맵?

//		HashMap<Integer, String> map = new HashMap<>();
//
//		for (int i = 0; i < strings.length; i++) {
//			map.put(i, strings[i]);
//		}

//		for (int j = 0; j < map.size(); j++) {
//			list[j] = map.get(j).charAt(n);
//		}

		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i];
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].charAt(n) > strings[j].charAt(n)) {
					answer[i] = strings[j];
					strings[j] = strings[i];
					strings[i] = answer[i];
				} // if
			} // for j
		} // for i
		System.out.println(Arrays.toString(answer));
	}

}
