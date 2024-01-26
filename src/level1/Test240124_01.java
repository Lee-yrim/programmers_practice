package level1;
//신고결과 받기

import java.util.HashMap;
import java.util.HashSet;

public class Test240124_01 {
	public static void main(String[] args) {

		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;

		// 해시맵
		// 공백기준으로 나눠서 해시맵에 저장인데
		// 정지기준에 부합하면 해시맵에 저장 이거아닌듯
		// 서로 다른사람이 한명을 신고했으면 정지되는데 그건 어떻게 계산하지

		// 결과 : 신고한 사람중에 정지당한 사람의 수
		// 무지가 누구누구를 신고햇는지
		// 무지가 신고한 그 사람이 정지를 당했는지
		// 사람별로 몇번 신고당햇는지 -> 신고당하면 +1?

		HashMap<String, Integer> map = new HashMap<>(); //일단 0으로 집어넣고 신고당하면 +1해줄까
//		String[] get = {};// 신고 받은사람 배열
//		String[] give = {};// 신고 한 사람 배열

		HashSet<String> set = new HashSet<>();

		// 맵에다가 사람이름이랑 0 부여
		for (int i = 0; i < id_list.length; i++) {
			map.put(id_list[i], 0); // muzi 0 이런식
		}

		// 준사람 받은사람 나누고 받았으면 맵에 +1
		for (int j = 0; j < report.length; j++) {
//			give[j] = report[j].split(" ")[0];
//			get[j] = report[j].split(" ")[1];
			// 받은사람에게 +1 추가
//			map.put(get[j], +1);
//			set.add(give[j]);
		}
//		System.out.println(set);

		for (int l = 0; l < map.size(); l++) {
			if (map.get(id_list[l]) > 2) {
				// ?answer...가...사람별로 처리결과를 받은 횟수인디....쿨럭

			}
		}

		// 결과 : 신고한 사람중에 정지당한 사람의 수
		// 무지가 누구누구를 신고햇는지
		// 무지가 신고한 그 사람이 정지를 당했는지
		// 사람별로 몇번 신고당햇는지 -> 신고당하면 +1?

//		int[] answer = new int[id_list.length]; // 정답을 담을 배열
//		int[] reportCount = new int[id_list.length]; // 각 유저별 신고당한 횟수를 저장할 배열
//
//		HashMap<String, Integer> idIndex = new HashMap<>(); // 각 유저의 아이디 인덱스를 저장하는 맵
//		HashMap<String, String> reporters = new HashMap<>(); // 신고당한 유저별로 해당 유저를 신고한 사람들의 목록을 저장하는 맵
//		HashSet<String> reportSet = new HashSet<>(); // 신고 케이스들을 저장하는 세트
//
//		for (int n = 0; n < id_list.length; n++) {
//			idIndex.put(id_list[n], n);
//		}
//
//		for (String str : report) {
//			reportSet.add(str);
//		}
//
//		// 본격적인 정보 처리
//		// 시작-------------------------------------------------------------------------------------
//
//		for (String str : reportSet) { // 각 신고 케이스마다 정보를 처리하는 반복문
//			String[] sArr = str.split(" "); // 불러온 신고 케이스 정보를 신고자와 피신고자로 분할
//			reportCount[idIndex.get(sArr[1])]++; // 피신고자의 신고당한 횟수 기록
//
//			String rString = reporters.getOrDefault(sArr[1], ""); // 피신고자의 신고자 목록을 불러온다
//
//			if (rString.equals("")) { // 피신고자의 신고자 목록에 새로운 신고자를 스트링 형태로 추가한다
//				rString = sArr[0];
//			} else {
//				rString += " " + sArr[0];
//			}
//
//			reporters.put(sArr[1], rString); // 추가한 뒤 다시 저장
//		}
//
//		for (int n = 0; n < reportCount.length; n++) { // 유저들의 신고당한 횟수들을 살펴보며 정지 당할 유저를 검색
//			if (reportCount[n] >= k) { // n번 유저가 신고당한 횟수가 정지 기준 이상일 경우
//				String[] reportersArr = reporters.get(id_list[n]).split(" "); // 문자열로 저장된 신고자 목록을 배열로 변환
//				for (String reporterName : reportersArr) { // 각 신고자마다 처리 결과 메일을 받은 횟수를 기록한다
//					answer[idIndex.get(reporterName)]++;
//				}
//			}
//		}

	}// main

}
