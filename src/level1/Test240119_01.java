package level1;
//가장 많이 받은 선물

import java.util.Arrays;

public class Test240119_01 {
	public static void main(String[] args) {

		String[] freinds = { "muzi", "ryan", "frodo", "neo" };
		String[] gifts = { "muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi",
				"frodo ryan", "neo muzi" };// 준 받은

		// 공백기준으로 이름나눠서 줫으면 선물지수를 +1 받앗으면 -1
		// 주고받은거 같으면 선물지수 체크
		// 선물지수 : 본인이 준 선물 - 받은선물
		// 선물지수도 같으면 다음달 패스
		// friends의 인덱스로 친구를 구분

		int[] giftdegree = new int[freinds.length];
		System.out.println(Arrays.toString(giftdegree));

		for (int i = 0; i < gifts.length; i++) {
			String[] splitname = gifts[i].split(" ");
//			System.out.println(splitname[i]);
			for (int j = 0; j < freinds.length; j++) {
				if (splitname[0].equals(freinds[j])) {
					giftdegree[j]++;// ?몇번쨰가 누구 지수인지 어케알지?
//					System.out.println("giftdegree" + giftdegree[j]);
				} // if
				if (splitname[1].equals(freinds[j])) {
					giftdegree[j]--;
				}
//				System.out.println("giftdegree"+ j + giftdegree[j]);
			} // for j
			System.out.println("giftdegree" + Arrays.toString(giftdegree) );
		} // for i

		for (int i = 0; i < freinds.length; i++) {

		}
	}

}
