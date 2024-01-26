package level2;

import java.util.ArrayList;
import java.util.*;

public class Test240126_01 {
	public static void main(String[] args) {

		// 공백기준 나누고
		// 비교하는 for?
		// 아니다 max,min 뭐엿지

		String s = "1 2 3 4";

		String answer = "";
		String[] arr = s.split(" ");
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}

		answer = Collections.min(list) + " " + Collections.max(list);

		System.out.println(answer);
	}

}
