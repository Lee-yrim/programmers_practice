package level1;
//성격유형검사

import java.util.HashMap;

public class Test240122_02 {
	public static void main(String[] args) {

		// 같으면 알파벳 기준 빠른 순ㅋㅋㅋㅋㅋㅋㅋ
		// 4하면 아무것도 아님
		// 5 6 7이 동의
		// 1 : 라이언R, 튜브T
		// 2 : 콘C 프로도F
		// 3 : 제이지J, 무지M
		// 4 : 어피치A, 네오N

		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };

		HashMap<Character, Integer> map=new HashMap<>();

		for (int j = 0; j < survey.length; j++) {
			int surv = choices[j];

			if (surv > 0 && surv < 4) {
				char c = survey[j].charAt(0);//A
				map.put(c, Math.abs((choices[j] - 4)));
				System.out.println("c에 해당하는"+map.get(c));
			}
		}

	}

}
