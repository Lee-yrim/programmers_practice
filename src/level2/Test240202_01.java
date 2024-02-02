package level2;

import java.util.Stack;

//올바른 괄호
public class Test240202_01 {
	public static void main(String[] args) {

		// ((()()))해도 맞네
		boolean answer = true;
//		String s = "(())()";
//		String s="(()(";
//		String s = ")()(";
		String s = "())))(((";

		int open = 0;
		int close = 0;

		if (s.charAt(0) == ')') {
			answer = false;
		}

		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i).equals('(')) {
			if (s.charAt(i) == '(') {
				open++;
			} else if (s.charAt(i) == ')') {
				close++;
			}
		} // for i
		if (open != close || open > close || close > open) {
			answer = false;
		}
		System.out.println(answer);

//		Stack<Character> stack = new Stack<>();
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i)=='(') {
//				stack.add('(');
//			}else {// ) 일때
//				if (stack.isEmpty()) {//이미 비어있으면
//					answer=false;
//				}else {
//					stack.pop();//기존의 ( 삭제
//				}
//			}
//		}//for i
//		if (stack.isEmpty()==false) {//뭐가 있으면 false
//			answer=false;
//		}
//		System.out.println(answer);

	}// main

}
