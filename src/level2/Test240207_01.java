package level2;
//숫자의 표현

public class Test240207_01 {
	public static void main(String[] args) {

		int n = 15;
//		int n = 10;
		int result = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) {
				sum += j;
				if (sum > n) {
					break;
				} else if (sum == n) {
					result++;
					break;
				}
			} // for j
			System.out.println(sum);
//			if (sum == 15) {
//				result++;
//			}
		} // for i
		System.out.println("result: " + result);
	}

}
