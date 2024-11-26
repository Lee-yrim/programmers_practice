package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class diceGame3 {


    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;
//        int a = 4;
//        int b = 1;
//        int c = 4;
//        int d = 4; //1681

        Solution solution = new Solution();

        int answer = solution.solution(a, b, c, d);
        System.out.println(answer);
    } //main

    //네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
    static class Solution {
        int solution(int a, int b, int c, int d) {

            int result = 0;

            int[] array = {a, b, c, d};

            //한줄복사 하는 법 ctrl + d

            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            if (array[0] == array[1]) {
                if (array[1] == array[2]) {
                    if (array[2] == array[3]) {
                        result = 1111 * array[3];
                    } else {
                        result = (10 * array[2] + array[3]) * (10 * array[2] + array[3]);
                    }
                } else if (array[2] == array[3]) {
                    result = (array[0] + array[2]) * Math.abs(array[0] - array[2]);
                } else {
                    result = (array[2] * array[3]);
                }

            } else if (array[1] == array[2]) {
                if (array[2] == array[3]) {
                    result = (10 * array[2] + array[0]) * (10 * array[2] + array[0]);
                } else {
                    result = (array[0] * array[3]);
                }
            } else if (array[2] == array[3]) {
                result = (array[0] * array[1]);
            } else {
                result = array[0];
            }

            return result;
        }
    }
}
