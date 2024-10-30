package level1;

import java.util.Arrays;
import java.util.Stack;

//같은 숫자는 싫어

public class Test240202_02 {
	public static void main(String[] args) {

		// 전 숫자랑 달라야 스택에 쌓음
		// 다 쌓고 배열에다가 옮겨

		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			if (stack.size() == 0 || stack.peek() != arr[i]) {
				stack.add(arr[i]);
			}
		} // for i

		int[] answer = new int[stack.size()];
		for (int j = 0; j < stack.size(); j++) {
			answer[j] = stack.elementAt(j);
		}//for j
		System.out.println(Arrays.toString(answer));
		
	}//main
// git test
}
