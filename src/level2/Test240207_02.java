package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//압축

public class Test240207_02 {
	public static void main(String[] args) {

		String msg = "KAKAO";
//		String msg = "TOBEORNOTTOBEORTOBEORNOT";

		ArrayList<String> dict = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		// 사전 초기화
		dict.add(""); // 인덱스를 A=1부터 시작하게 하기위해서 0은 빈곳으로 두고 추가

		for (char c = 'A'; c <= 'Z'; c++) {
			dict.add(String.valueOf(c));
		}
//		System.out.println(dict.get(1)); //A잘나옴

///////////////////////////////////////////////////////////////////////////

		for (int i = 0; i < msg.length(); i++) {
			// 문자열 w(현재입력)찾기
			String w = String.valueOf(msg.charAt(i)); // K

			// 다음문자 추가하기
			for (int j = i + 1; j < msg.length(); j++) {
				// 다음문자 c 찾기
				String c = String.valueOf(msg.charAt(j));// A
				String wc = w + c;// 추가할수도 있는 문자 wc 만들어내기 //두번째 wc=KA
//				System.out.println(wc);

				if (!dict.contains(wc)) {
					// 사전에 wc가 없으면 추가해줘라
					dict.add(wc);// 27인덱스에 KA추가됨
					result.add(dict.indexOf(w));
					System.out.println("사전에 추가된 문자열 : " + dict.get(dict.size() - 1));
//					i=j;
					break;// 추가햇으니까 다음 i로 이동
				} // if
					// 있으면 어카지? 뒤에 하나 더 붙여봐야되는디?wc가 KAO가 돼야함
				w = wc;// 하면 wc가 KAO가 됨

//				// 마지막 문자열 처리
//				if (j == msg.length()) {
//					result.add(dict.indexOf(w));
//				}

				i = j;

			} // for j

			// 마지막 문자열 처리
			if (i + 1 == msg.length()) {
				result.add(dict.indexOf(w));
			}

//			result.add(dict.indexOf(w));
			System.out.println("출력될 문자열 wc : " + dict.indexOf(w));
		} // for i
		System.out.println("결과:" + result);
		// 사전에 4번쨰 AO도 추가되는 문제 발생 -> 54줄 i=j처리
		// 세문자 짜리가 추가되면 문자가 하나 이동하는게 아니라 두개 이동해야하니까
		// 마지막 문자열....

		int[] answer = new int[result.size()];

		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}

		System.out.println("answer: " + Arrays.toString(answer));

		// 혼자할때
		// 1. 현재입력 찾기

//		for (int j = 0; j < msg.length(); j++) {
////			for (int k = dict.size(); k >= 0; k--) {
//			// 새로운 문자열이 나오면 뒤에 저장되기 때문에 뒤에서부터 탐색하면 가장 긴글자부터 찾을 수 있을듯?
//			String w = String.valueOf(msg.charAt(j));// 여기서 str을 선언해주면 출력한 문자를 삭제해주는 효과를 얻음
//			// w=현재입력
//			String c = String.valueOf(msg.charAt(j + 1));
//			System.out.println("c:" + c);
//			String wc = w + c;// 사전 탐색할 변수
//
//			// wc가 사전에 있으면 result에 추가하고 없으면 사전 맨뒤에 추가
////			for (int k = j + 1; k < msg.length(); k++) {
//			for (int k = dict.size(); k >= 0; k--) {
//				if(dict.contains(wc)) {
//					
//				}
//			}

//				if (w.equals(dict.get(k))) {
//					result.add(k + 1);
//				}
//				if(!dict.contains(str2))
//			} // for k
//		} // for j

		// 처음
		/*for(int i = 0 ; i < 26; i++) {
		       dic.add(String.valueOf((char)('A'+i)));
		   }
		
		   for(int i = 0 ; i < msg.length() ; i++) {
		       for(int j = dic.size()-1 ; j >= 0 ; j--) {
		           if(msg.substring(i).startsWith(dic.get(j))) {
		               i += dic.get(j).length()-1;
		               result.add(j+1);
		               if(i+1 < msg.length())
		                   dic.add(dic.get(j)+msg.charAt(i+1));
		               break;
		           }
		       }
		   }
		
		   int[] answer = new int[result.size()];
		
		   for(int i = 0 ; i < result.size() ; i++) 
		       answer[i] = result.get(i);
		
		   return answer;
		*/

	}

}
