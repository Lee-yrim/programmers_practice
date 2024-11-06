package level0;

// ù ��° �м��� ���ڿ� �и� ���ϴ� numer1, denom1, �� ��° �м��� ���ڿ� �и� ���ϴ� numer2, denom2�� �Ű������� �־����ϴ�.
// �� �м��� ���� ���� ��� �м��� ��Ÿ���� �� ���ڿ� �и� ������� ���� �迭�� return �ϵ��� solution �Լ��� �ϼ��غ�����.

// numer1	denom1	numer2	denom2	result
// 1	2	3	4	[5, 4]
// 9	2	1	3	[29, 6]

public class plusFraction {
    public static void main(String[] args) {

//        int numer1 = 1;
//        int denom1 = 2;
//        int numer2 = 3;
//        int denom2 = 4;

//        int numer1 = 9;
//        int denom1 = 2;
//        int numer2 = 1;
//        int denom2 = 3;

        int numer1 = 997;
        int denom1 = 997;
        int numer2 = 997;
        int denom2 = 997;

        Solution sol = new Solution();

        int[] answer = sol.solution(numer1, denom1, numer2, denom2);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }//main

    static class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {

            int[] answer = new int[2];
            int denomgop = denom1 * denom2;
            int gopamount1 = denomgop / denom1;
            int gopamount2 = denomgop / denom2;

            int resultnumer = (numer1 * gopamount1) + (numer2 * gopamount2);

            for (int i = denomgop; i > 0; i--) {
                if (resultnumer % i == 0 && denomgop % i == 0) {
                    resultnumer /= i;
                    denomgop /= i;
                }// if

                answer[0] = resultnumer;
                answer[1] = denomgop;
            }//for i

            return answer;
        }
    }
}
