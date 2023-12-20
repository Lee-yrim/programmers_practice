package level1;
//체육복

import java.util.ArrayList;
import java.util.Arrays;

public class Test231220_01 {
	public static void main(String[] args) {

		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };

		int answer = n - lost.length;
		
		Arrays.sort(lost);
		Arrays.sort(reserve);

//		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Integer> lostlist = new ArrayList<>();
		
//		for (int i = 0; i < reserve.length; i++) {
//			list.add(reserve[i]);
//		} // for
//		System.out.println(list);

//		for (int i = 0; i < lost.length; i++) {
//			for (int j = 0; j < reserve.length; j++) {
//				if (lost[i] == reserve[j]) {
//					answer++;
//					lostlist.remove(i);
//					list.remove(j);
//					break;
//				}
//			}
//		}
		
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i]=-1;
					reserve[j]=-1;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
					answer++;
					reserve[j]=-1;
//					list.remove(j);
					break;// 한번 삭제되면 i반복으로 가기위해서
				}
			}
		}
		
		System.out.println(answer);
//		System.out.println(list);
//		System.out.println(n);
	}// main
}
