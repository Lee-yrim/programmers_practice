package level2;
//타겟넘버

public class Test240216_01 {
	public static void main(String[] args) {

	int[] numbers = { 1, 1, 1, 1, 1 };
	int target = 3;
	int answer = 0;
	
//	dfs(numbers, target, 0, 0);

	// 경우의수-> 2의n승 pow사용
	// 방법에 해당하면 answer++

//		int sum = 0;
//		int goal = 0;
//
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
////		System.out.println("sum: "+sum);
//		goal = sum - target;

//		int answer = 0;
//		int length = numbers.length;
//		int cnt = (int) Math.pow(2, length);// 경우의수 32
//
//		for (int i = 0; i < cnt; i++) {
//			int sum = 0;
//			for (int j = 0; j < length; j++) {
////				int sum = 0;
////				int goal = 0;
//		//
////				for (int i = 0; i < numbers.length; i++) {
////					sum += numbers[i];
////				}
//////				System.out.printl
//
//			}
//			if (sum == target) {
//				answer++;
//			}
//		}
//		System.out.println(answer);

//	public int solution(int[] numbers, int target) {
//		dfs(numbers, target, 0, 0);
//		return answer;
//	}

//	public void dfs(int[] numbers, int target, int idx, int sum) {
//		if (idx == numbers.length) {
//			if (target == sum)
//				answer++;
//			return;
//		}
//		dfs(numbers, target, idx + 1, sum + numbers[idx]);
//		dfs(numbers, target, idx + 1, sum - numbers[idx]);
//	}

}

}
