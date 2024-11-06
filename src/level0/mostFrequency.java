package level0;
// �ֺ��� �־��� �� �߿��� ���� ���� ������ ���� �ǹ��մϴ�.
// ���� �迭 array�� �Ű������� �־��� ��, �ֺ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
// �ֺ��� ���� ���� -1�� return �մϴ�.

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
