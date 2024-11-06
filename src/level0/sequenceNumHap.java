package level0;


//���ӵ� �� ���� ������ ���� 12�� �Ǵ� ���� 3, 4, 5�Դϴ�. �� ���� num�� total�� �־����ϴ�. ���ӵ� �� num���� ���� ���� total�� �� ��, ���� �迭�� ������������ ��� return�ϵ��� solution�Լ��� �ϼ��غ�����.

//num	total	result
//3	12	[3, 4, 5]
//5	15	[1, 2, 3, 4, 5]
//4	14	[2, 3, 4, 5]
//5	5	[-1, 0, 1, 2, 3]

public class sequenceNumHap {
    public static void main(String[] args) {

        int num = 3, total = 12;
//        int num = 5, total = 15;

        Solution sol = new Solution();

        int[] answer = sol.solution(num, total);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    } //main

    static class Solution{
        public int[] solution(int n, int k) {

            int[] answer = new int[n];
            int startnum = k/n - (n-1)/2;

            for (int i = 0; i < n; i++) {
                answer[i] = startnum;
                startnum++;
            }

            return answer;
        }
    }

}
