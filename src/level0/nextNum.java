package level0;
//�������� Ȥ�� ������ common�� �Ű������� �־��� ��, ������ ���� �������� �� ���ڸ� return �ϵ��� solution �Լ���
// �ϼ��غ�����.

//���ѻ���
//2 < common�� ���� < 1,000
//-1,000 < common�� ���� < 2,000
//common�� ���Ҵ� ��� �����Դϴ�.
//�������� Ȥ�� �������� �ƴ� ���� �����ϴ�.
//�������� ��� ����� 0�� �ƴ� �����Դϴ�.

//common	result
//[1, 2, 3, 4]	5
//[2, 4, 8]	16

public class nextNum {
    public static void main(String[] args) {

        Solution sol = new Solution();
//        int[] common = {1,2,3,4};
//        int[] common = {2,4,8};
//        int[] common = {-1, 2, -4};
//        int[] common = {1, 2, 4};
        int[] common = {1, 3, 9};

        int answer = sol.solution(common);
        System.out.println(answer);

    }// main

    static class Solution {
        public int solution(int[] common) {
            boolean issub = true;

            if ((common[1] - common[0]) == (common[2] - common[1])) {
                issub = true;
            } else {
                issub = false;
            } //else

            int answer = 0;
            if (issub == true) {
                answer = common[common.length - 1] + (common[1] - common[0]);
            } else if (issub == false && common[0] > 0 && common[0] != 1) {
                answer = common[common.length - 1] * common[0];
            } else if (issub == false && common[0] == 1) {
                answer = common[common.length - 1] * common[1];
            } else if (issub == false && common[0] != 0) {
                answer = common[common.length - 1] * common[1] / common[0];
            }
            return answer;
        }
    } //Solution


//    static class Solution {
//        public int solution(int[] common) {
//            int answer = 0;
//
//            // ������������ Ȯ��
//            if ((common[1] - common[0]) == (common[2] - common[1])) {
//                // ���������� ��� ���� ���� ������ŭ ����
//                int diff = common[1] - common[0];
//                answer = common[common.length - 1] + diff;
//            } else {
//                // �������� ��� ���� ���� ����ŭ ����
//                int ratio = common[1] / common[0];
//                answer = common[common.length - 1] * ratio;
//            }
//
//            return answer;
//        }
//    } // Solution
}
