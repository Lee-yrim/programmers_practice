package level1;
//개인정보 수집 유효기간

import java.util.ArrayList;
import java.util.HashMap;

public class Test240122_01 {
	public static void main(String[] args) {

		String today = "2022.05.19";
		String[] terms = { "A 6", "B 12", "C 3" };
		String[] privacies = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };
		ArrayList<Integer> list = new ArrayList<>();

		HashMap<String, Integer> map = new HashMap<>();
		int[] answer = {};

		// privacies를 .이랑 공백기준으로 나누고 각각 저장(반복돌리면서)
		// terms도 공백기준으로 나눠서 저장하는데 해시맵? 인덱스 잇으니까? 좋은점이 잇는건가
		// 파기일자 계산 : privacies나눈거에서 종류에 해당하는 만큼 날짜 플러스
		// 오늘몇일인지 계산 : substring사용
		//

		// 오늘 날짜 계산
//		System.out.println(today.split("\\.")[0]);
		int year = Integer.parseInt((today.split("\\.")[0]));// 2022
		int month = Integer.parseInt((today.split("\\.")[1]));// 05
		int day = Integer.parseInt((today.split("\\.")[2]));// 19

		// 일단 맵부터
		for (int j = 0; j < terms.length; j++) {
			map.put(terms[j].split(" ")[0], Integer.parseInt(terms[j].split(" ")[1]));
		}
		System.out.println(map);
//		System.out.println(map.get("A"));

		// terms 나눠서
		// 오늘 year에서 계약날짜 뺀 년에다가 ?
		// 그러면 오늘이 2022.0101이고 계약일이 20211225면 6일차이인데...
		// 2022-2021 * 365?.....

		// 계약날짜
		for (int i = 0; i < privacies.length; i++) {

			String date = privacies[i].split(" ")[0];// 날짜저장

//			String kind = privacies[i].split(" ")[1];// 종류 저장
			// A이면 A에 해당하는 6개월만큼 날짜 계산해서 계약날짜에다가 더해야함 그래서 맵쓰나

			int kind = map.get(privacies[i].split(" ")[1]) * 28;

			// 계약파기해야하는 날짜 계산
			int num = (year - Integer.parseInt(date.split("\\.")[0])) * 28 * 12
					+ (month - Integer.parseInt(date.split("\\.")[1])) * 28
					+ (day - Integer.parseInt(date.split("\\.")[2]));
			System.out.println(num);

			if (num >= kind) {
				list.add(i);
			}
		} // for i
		
		System.out.println(list);
		
//		if (list.size()>0) {
//			
//		}
		for (int j = 0; j < list.size(); j++) {
			answer[j] = list.get(j);
		}
//		System.out.println(answer);
	}

}
