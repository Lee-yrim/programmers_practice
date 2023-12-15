package level1;
//두개뽑아서 더하기

import java.util.ArrayList;
import java.util.Arrays;

public class Test231213_01 {
	public static void main(String[] args) {
		
		int[] numbers= {2,1,3,4,1};
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1 ; j<numbers.length ; j++) {
				if(!(list.contains(numbers[i]+numbers[j]))) {
					list.add(numbers[i]+numbers[j]);
				}//if
			}//for j
			System.out.println(list);
		}//for i
		
		int[] answer = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
		Arrays.sort(answer);
		System.out.println("ans:"+Arrays.toString(answer));
		
//		list=Collections.sort(list);
//		Collections.sort(list);
//		System.out.println(list);
//		list=Arrays.sort(list);
	}//main

}
