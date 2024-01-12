package level1;

import java.util.ArrayList;
import java.util.List;

public class Test240112_01 {

	public static void main(String[] args) {
		
		//  ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]
		
		int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
		String ext="date";
		String sort_by="remain";
		int val_ext=20300501;
		String[] ext_arr= {"code","date","maximum","remain"};
		
//		List<E>
		
		//ext가 뭔지 알아내고 date이면 date기준으로 valext보다 작은애들만 뽑아서 sortby에 해당하는 거로 구해
		//extarr에 있는 거를 하나씩 돌면서 주어진 ext랑 같으면 그 ext를 저장
		
		String what="";
		for(int i=0;i<ext_arr.length;i++) {
			if(ext.equals(ext_arr[i])) {
				what= "ext_arr[i]";
			}
		}
		
		//기준보다 작은거 골라내
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<data.length;i++) {
//			if(data[i][]) //....?인덱스...?
		}
		
		
	}
}
