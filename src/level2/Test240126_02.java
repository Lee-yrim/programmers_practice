package level2;

import java.util.ArrayList;
import java.util.Arrays;

//k진수에서 소수 개수 구하기

public class Test240126_02 {
	public static void main(String[] args) {

		// 일단 k진수로 변환
		//

		int n = 437674;
//		int n = 110011;
		int k = 3;
//		int k = 10;
		int answer = 0;

		// 일단 변환
		String s = Integer.toString(n, k);
//		System.out.println(s);//211020101011

		// 0기준으로 나누고 배열에 저장한 다음 배열 각 저기뭐야 항목들이 소수인지 판별
		String[] arr = s.split("0+");
		System.out.println(Arrays.toString(arr));

		// 소수인지 판별
//		for (int i = 0; i < arr.length; i++) {
//			int cnt = 0;
////			if (Integer.parseInt(arr[i]) > 1) {
//			if (Long.parseLong(arr[i]) > 1) {
////				for (int j = 2; j < Long.parseLong(arr[i]); j++) {
//				for (int j = 2; j <= Math.sqrt(Long.parseLong(arr[i])); j++) {
//					if (Long.parseLong(arr[i]) % j == 0) {
//						System.out.println("소수아님");
//						cnt++;
//					}
//				} // for j
//			}
//
//			if (cnt == 0 && Long.parseLong(arr[i]) != 1) {// 왜 ==해야함?
//				answer++;
//			}
//		} // for i
//		System.out.println(answer);

		for (int i = 0; i < arr.length; i++) {
			boolean bool = true;
			// if (Integer.parseInt(arr[i]) > 1) {
			if (Long.parseLong(arr[i]) > 1) {
//				for (int j = 2; j < Long.parseLong(arr[i]); j++) {
				for (int j = 2; j <= Math.sqrt(Long.parseLong(arr[i])); j++) {
					if (Long.parseLong(arr[i]) % j == 0) {
						bool=false;
						break;
					}
				} // for j
			}

			if (bool=true && Long.parseLong(arr[i])!=1) {// 왜 ==해야함?
				answer++;
			}
		} // for i
		System.out.println(answer);

	}// main

}
