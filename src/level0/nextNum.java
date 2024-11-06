package level0;
//등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를
// 완성해보세요.

//제한사항
//2 < common의 길이 < 1,000
//-1,000 < common의 원소 < 2,000
//common의 원소는 모두 정수입니다.
//등차수열 혹은 등비수열이 아닌 경우는 없습니다.
//등비수열인 경우 공비는 0이 아닌 정수입니다.

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
//            // 등차수열인지 확인
//            if ((common[1] - common[0]) == (common[2] - common[1])) {
//                // 등차수열일 경우 다음 항을 공차만큼 더함
//                int diff = common[1] - common[0];
//                answer = common[common.length - 1] + diff;
//            } else {
//                // 등비수열일 경우 다음 항을 공비만큼 곱함
//                int ratio = common[1] / common[0];
//                answer = common[common.length - 1] * ratio;
//            }
//
//            return answer;
//        }
//    } // Solution
}
