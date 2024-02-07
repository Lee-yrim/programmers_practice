package level2;

import java.util.ArrayList;

//압축

public class Test240207_2 {
	public static void main(String[] args) {

		String msg = "KAKAO";

		ArrayList<String> dict = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		// 사전 초기화
		dict.add(""); // 인덱스를 A=1부터 시작하게 하기위해서 0은 빈곳으로 두고 추가

		for (char c = 'A'; c <= 'Z'; c++) {
			dict.add(String.valueOf(c));
		}
//		System.out.println(dict.get(1)); //A잘나옴

		/*for (int j = 0; j < msg.length(); j++) {
			for (int k = dict.size(); k >= 0; k--) {
				//새로운 문자열이 나오면 뒤에 저장되기 때문에 뒤에서부터 탐색하면 가장 긴글자부터 찾을 수 있을듯?
		//				System.out.println(msg.charAt(j));
				String str = String.valueOf(msg.charAt(j));
				String str2 = String.valueOf(msg.charAt(j)) + String.valueOf(msg.charAt(j + 1));
				if (str.equals(dict.get(k))) {
					result.add(k + 1);
				}
		//				if(!dict.contains(str2))
			} // for k
		} // for j
		*/

		// 혼자할때
		//1. 현재입력 찾기
		
		for (int j = 0; j < msg.length(); j++) {
//			for (int k = dict.size(); k >= 0; k--) {
			// 새로운 문자열이 나오면 뒤에 저장되기 때문에 뒤에서부터 탐색하면 가장 긴글자부터 찾을 수 있을듯?
			String w = String.valueOf(msg.charAt(j));// 여기서 str을 선언해주면 출력한 문자를 삭제해주는 효과를 얻음
			// w=현재입력
			String c = String.valueOf(msg.charAt(j + 1));
			System.out.println("c:" + c);
			String wc = w + c;// 사전 탐색할 변수

			// wc가 사전에 있으면 result에 추가하고 없으면 사전 맨뒤에 추가
//			for (int k = j + 1; k < msg.length(); k++) {
			for (int k = dict.size(); k >= 0; k--) {
				if(dict.contains(wc)) {
					
				}
			}

//				if (w.equals(dict.get(k))) {
//					result.add(k + 1);
//				}
//				if(!dict.contains(str2))
//			} // for k
		} // for j

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
