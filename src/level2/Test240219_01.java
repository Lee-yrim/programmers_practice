package level2;
//피보나치 수

public class Test240219_01 {
	public static void main(String[] args) {

		int answer = 0;
		int n = 3;

		int[] result = new int[n + 1];
		result[0] = 0;
		result[1] = 1;

		for (int i = 2; i < result.length; i++) {
			result[i] = (result[i - 2] + result[i - 1]) % 1234567;
		}

//		answer = result[result.length - 1] % 1234567;
		answer = result[result.length - 1];
		System.out.println(answer);

	}

}
