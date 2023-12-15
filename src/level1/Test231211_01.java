package level1;

public class Test231211_01 {
	public static void main(String[] args) {

		String answer;
		String new_id;

		String ied = "...!@BaT#*..y.abcdefghijklm";
//		String ied = "a";

		// 1단계
		ied = ied.toLowerCase();
		System.out.println("1: " + ied);

		// 2단계
		char[] arr = ied.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.')) {
				ied = ied.replace(c, ' ');
				ied = ied.replaceAll(" ", "");// c삭제
			} // if
		} // 2
		System.out.println("2: " + ied);

		// 3단계
		while (ied.contains("..")) {
			ied = ied.replace("..", ".");
		}
		System.out.println("3: " + ied);

		// 4단계
		if (ied.charAt(0) == '.') {
			ied = ied.substring(1, ied.length());
		}
		if (ied.charAt(ied.length() - 1) == '.') {
			ied = ied.substring(0, ied.length() - 1);
		}
		System.out.println("4: " + ied);

		// 5
		if (ied.equals("")) {
			ied = "a";
		}
		System.out.println("5: " + ied);

		// 6
		if (ied.length() >= 16) {
			ied = ied.substring(0, 15);

			if (ied.charAt(ied.length() - 1) == '.') {
				ied = ied.substring(0, ied.length() - 1);
			}
		}
		System.out.println("6: " + ied);

		// 7
		while (ied.length() <= 2) {
			if (ied.length() < 3) {
				ied = ied + ied.charAt(ied.length() - 1);
			}
		}
		System.out.println("7: " + ied);

//            return answer;
	}
}

//}
