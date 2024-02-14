package level2;

public class Test240214_01 {
	public static void main(String[] args) {

		int n = 78;
		int answer = 0;

		// n보다 큰 자연수
		// 2진수로 했을 떄 1의 개수 같 cnt
		//

		String str = Integer.toBinaryString(n);
		System.out.println(str);

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				cnt++;
			}
//			System.out.println("cnt: " + cnt);
		} // for i

		for (int j = n + 1; j < 1000000; j++) {
			String str2 = Integer.toBinaryString(j);
			System.out.println(str2);
			int cnt2 = 0;
			for (int k = 0; k < str2.length(); k++) {
				if (str2.charAt(k) == '1') {
					cnt2++;
				}
			} // for k
			System.out.println("cnt:"+cnt+"cnt2: "+cnt2);
			if (cnt == cnt2) {
				answer = j;
				break;
			}
		} // for j
		System.out.println(answer);
	}

}
