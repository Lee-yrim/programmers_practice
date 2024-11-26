//package level0;
//
//public class waterShortage {
//
//    public static void main(String[] args) {
//
//        int storage = 5141;
//        int usage = 500;
//        int change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
//
//        Solution sol = new Solution();
//
//        int result = sol.solution(storage, usage, change);
//
//    }//main
//
//    static class Solution{
//        int solution(int storage, int usage, int[] change){
//            int total_usage = 0;
//
//            for(int i=0; i<change.length; i++){
//                usage = total_usage * change[i] / 100;
//                total_usage += usage;
//                if(total_usage > storage){
//                    return i;
//                }
//            }
//    } // class Solution
//}
