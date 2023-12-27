package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Test231227_02 {
	public static void main(String[] args) {

//		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
//		String[] completion = { "josipa", "filipa", "marina", "nikola" };
//		String answer = "";
//
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//
//		for (int i = 0; i < completion.length; i++) {
//			if (participant[i].equals(completion[i])) {
//				continue;
//			} else {
//				answer = participant[i];
//			}
//		}
//		if (answer == "") {
//			answer = participant[participant.length - 1];
//		}
//		System.out.println(answer);
//	}
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = { "stanko", "ana", "mislav"};

//		HashMap<String, Integer> hashMap = new HashMap();
//		String answer = "";
//
//		for (int i = 0; i < participant.length; i++) {
//			if (hashMap.get(participant[i]) != null) {
//				hashMap.put(participant[i], hashMap.get(participant[i]) + 1);
//			} else {
//				hashMap.put(participant[i], 1);
//			}
//		}
//
//		for (int i = 0; i < completion.length; i++) {
//			if (hashMap.get(completion[i]) != null) {
//				hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
//			}
//
//		}
//
//		for (String key : hashMap.keySet()) {
//			if (hashMap.get(key) != 0) {
//				answer = key;
//			}
//		}
		
		String answer = "";
	      HashMap<String, Integer> checkMap = new HashMap<>();
	      
	      for(String name : participant) {
	         checkMap.put(name, checkMap.getOrDefault(name, 0)+1);
	      }
	      
	      for(String name : completion) {
	         checkMap.put(name, checkMap.get(name)-1);
	      }
	      
	      for(String name : checkMap.keySet()) {
	         if(checkMap.get(name)!=0) {
	            answer = name;
	            break;
	         }
	      }

	}
}
