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

    //�� �ֻ������� ���� ���ڰ� ��� p�� ���ٸ� 1111 �� p���� ����ϴ�.
//�� �ֻ������� ���� ���ڰ� p�� ���� ������ �ٸ� �ֻ������� ���� ���ڰ� q(p �� q)��� (10 �� p + q)2 ���� ����ϴ�.
//�ֻ����� �� ���� ���� ���� ������, ���� ���ڸ� ���� p, q(p �� q)��� �Ѵٸ� (p + q) �� |p - q|���� ����ϴ�.
//��� �� �ֻ������� ���� ���ڰ� p�� ���� ������ �� �ֻ������� ���� ���ڰ� ���� p�� �ٸ� q, r(q �� r)�̶�� q �� r���� ����ϴ�.
//�� �ֻ����� ���� ���ڰ� ��� �ٸ��ٸ� ���� ���� �� ���� ���� ���� ��ŭ�� ������ ����ϴ�.
    static class Solution {
        int solution(int a, int b, int c, int d) {

            int result = 0;

            int[] array = {a, b, c, d};

            //���ٺ��� �ϴ� �� ctrl + d

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
