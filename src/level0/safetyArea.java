package level0;

public class safetyArea {
    public static void main(String[] args) {

//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}; //16
        int[][] board = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}; //13

        Solution sol = new Solution();
        int answer = sol.solution(board);

        System.out.println(answer);

    }//main

    static class Solution {
        public int solution(int[][] board) {
            int answer = board.length * board.length;

            int[][] countArray = new int[board.length][board.length];

            // board 배열 깊은복사
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    countArray[i][j] = board[i][j];
                } //for j
            } //for i

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 1) {
                        //함수호출
                        countArray = countBomb(i, j, countArray);
                    } // if
                } // for j
            } // for i

            for (int i = 0; i < countArray.length; i++) {
                for (int j = 0; j < countArray.length; j++) {
                    if (countArray[i][j] == 1) {
                        answer--;
                    }
                }// for j
            }// for i
            return answer;
        } //solution

        public static int[][] countBomb(int i, int j, int[][] countArray) {
            int[] numX = {-1, 0, 1, -1, 1, -1, 0, 1};
            int[] numY = {-1, -1, -1, 0, 0, 1, 1, 1};

            int locX = 0, locY = 0;

            for (int k = 0; k < 8; k++) {
                locX = i + numX[k];
                locY = j + numY[k];

                if (locX >= 0 && locX < countArray.length && locY >= 0 && locY < countArray.length && countArray[locX][locY] == 0) {
                    countArray[locX][locY] = 1;
                }

            }// for k
            return countArray;
        }//countBomb
    } // class Solution
}
