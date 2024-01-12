package level1;

public class Test240112_02 {
	public static void main(String[] args) {

		String[][] board = { { "blue", "red", "orange", "red" }, { "red", "red", "blue", "orange" },
				{ "blue", "orange", "red", "red" }, { "orange", "orange", "red", "blue" } };
//		String[][] board = { { "yellow", "green", "blue" }, { "blue", "green", "yellow" },
//				{ "yellow", "blue", "blue" } };
		int n = board.length;
		int cnt = 0;
		int[] dh = { 0, 1, -1, 0 };
		int[] dw = { 1, 0, 0, -1 };

		int h = 1, w = 1;
//		int h = 0, w = 1;

		for (int i = 0; i <= 3; i++) {
			int h_check = h + dh[i];
			int w_check = w + dw[i];

			if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
				if (board[h][w] == board[h_check][w_check]) {
					cnt++;
				} // if
			} // if
		} // for
		System.out.println(cnt);
	}
}
