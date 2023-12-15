package level1;

import java.util.ArrayList;

public class Test231215_02 {
	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		int answer = 0;

		ArrayList<Integer> arr = new ArrayList<>(); // 바구니

		for (int i = 0; i < moves.length; i++) { // i는 moves
			for (int j = 0; j < board.length; j++) { // j는 배열
				int choose = board[j][moves[i]-1];
				board[j][moves[i]-1]=0;
				if (choose != 0) {// 뽑은 인형이 있으면
					if (arr.size() == 0) {// 첫번째 냅다 추가
						arr.add(choose);
					} else if (choose != arr.get(arr.size() - 1)) {// 가장 최근에 넣은 것과 일치하지 않으면 추가
						arr.add(choose);
					} else { // 그외 터짐
						arr.remove(arr.size() - 1);
						answer += 2;
					} // 터짐
					break;
//					System.out.println(answer);
				} // if
//				choose = 0; // 인형뽑으면 빈곳 됨
			} // for j
		} // for i
		
//		for (int i = 1; i <= moves.length; i++) { // i는 moves
//			for (int j = 0; j < board.length; j++) { // j는 배열
//				int choose = board[j][i-1];
//
//				if (choose != 0) {// 뽑은 인형이 있으면
//					if (arr.size() == 0) {// 첫번째 냅다 추가
//						arr.add(choose);
//					} else if (choose != arr.get(arr.size() - 1)) {// 가장 최근에 넣은 것과 일치하지 않으면 추가
//						arr.add(choose);
//					} else { // 그외 터짐
//						arr.remove(arr.size() - 1);
//						answer += 2;
//					} // 터짐
//					System.out.println(answer);
//				} // if
//				board[j][i-1] = 0; // 인형뽑으면 빈곳 됨
//			} // for j
//		} // for i
		
System.out.println(answer);
	}

}
