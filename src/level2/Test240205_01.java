package level2;

import java.util.Arrays;

//이진변환 반복하기

public class Test240205_01 {
	public static void main(String[] args) {

		int[] answer = new int[2];
		String s = "110010101001";
//		String s = "01110";

		int deletezero = 0;
		int changecnt = 0;

		while (!s.equals("1")) {
			int orilength = s.length();// 12 -> 3
			s = s.replace("0", "");
			System.out.println("orilength:"+orilength);
			int length = s.length();// 6
			deletezero += orilength - length;
			System.out.println("0지운개수:"+ deletezero);
			String binary = Integer.toBinaryString(length);// 110
			System.out.println(binary);
			changecnt++;

			s = binary;// 110

//			System.out.println(s);
//			System.out.println(length);

		} // while
		answer[0] = changecnt;
		answer[1] = deletezero;
		System.out.println(Arrays.toString(answer));

	}

}
