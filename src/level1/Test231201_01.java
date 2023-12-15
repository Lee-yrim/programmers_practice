package level1;

import java.util.ArrayList;
import java.util.Collections;

public class Test231201_01 {
	public static void main(String[] args) {
		String answer = "";
//		String X = "5525";
//		String X = "100";
		String X = "12321";
//		String Y = "1255";
//		String Y = "2345";
//		String Y = "203045";
		String Y = "42531";
		
		ArrayList <Character> arr = new ArrayList<>();//같은 숫자 나오면 담아줄 배열
		StringBuffer sb = new StringBuffer(Y);//deleteCharAt 하기위함
		
		for(int i=0;i<X.length();i++) {
			char c=X.charAt(i); //X에서 문자뽑아냄
			for(int j=0;j<sb.length();j++) {
				char cy=sb.charAt(j);
				if (c==cy) {//X에서 뽑은 문자랑 Y에서 뽑은문자랑 같으면
					arr.add(c);//arraylist에 추가해주고 
					int findidx=Y.indexOf(cy);//중복으로 뽑히는것을 방지하기 위해서 인덱스를 우선 찾고
					System.out.println(findidx);
					sb.deleteCharAt(findidx);//인덱스에 해당하는 문자를 삭제하고...
					System.out.println(sb);
				}// if
				
			}//for j
		}//for i
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		for(int m=arr.size()-1 ; m>=0 ; m--) {
			answer+=arr.get(m);
		}
		
		if(answer=="") {
			answer="-1";
		}else if(answer.charAt(0)=='0') {
			answer="0";
		}
		System.out.println(answer);
	}

}
