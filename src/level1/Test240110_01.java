package level1;

public class Test240110_01 {
	public static void main(String[] args) {

		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] lastdate = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int a = 5;
		int b = 24;
		int totaldate = 0;

		for (int i = 0; i < a - 1; i++) {
			totaldate += lastdate[i]; // 전달까지 더함
		} // for i
		totaldate += b;// 해당달 더함

		System.out.println(totaldate % 7);
		System.out.println(day[totaldate % 7 - 1]);

	}

}
