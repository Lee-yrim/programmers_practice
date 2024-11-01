package level0;

public class OXquiz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        String[] result = solution.solution(quiz);

        // 결과 출력
        for (String res : result) {
            System.out.println(res);
        }
    }//main

    static class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];

            for (int i = 0; i < quiz.length; i++) {
                String prob = quiz[i];
                String[] quest = prob.split(" ");

                if (quest[1].equals("+")) {
                    answer[i] = Integer.parseInt(quest[0]) + Integer.parseInt(quest[2]) == Integer.parseInt(quest[4]) ? "O" : "X";
                } else {
                    answer[i] = Integer.parseInt(quest[0]) - Integer.parseInt(quest[2]) == Integer.parseInt(quest[4]) ? "O" : "X";
                }
            }
            return answer;
        }
    } //Solution
} //class
