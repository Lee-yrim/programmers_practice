package level0;
// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
// 최빈값이 여러 개면 -1을 return 합니다.

import java.util.ArrayList;

//array         	result
//[1, 2, 3, 3, 3, 4]	3
public class mostFrequency {
    public static void main(String[] args) {

        Solution solution = new Solution();

//        int[] array = {1, 2, 3, 3, 3, 4};
//        int[] array = {1, 1, 2, 2};
//        int[] array = {1};
//        int[] array = {1, 2, 1, 2, 1, 2, 1};
        int[] array = {80, 80, 80, 9, 9};
//        int[] array = {12,12,1};

        int answer = solution.solution(array);
        System.out.println(answer);
    } //main

    static class Solution {
        public int solution(int[] array) {
            int[] count = new int[1000];

            for (int i = 0; i < array.length; i++) {
                int j = array[i];
                count[j]++;
            }//for i
            int max = 0;
            int maxnum = 0;

            for (int i = 0; i < count.length; i++) {
                if (count[i] > max ) {
                    max = count[i];
                    maxnum = i;
                } else if (count[i] == max) {
                    maxnum = -1;
                }
            } //for i
            return maxnum;
        }
    }

}//class
