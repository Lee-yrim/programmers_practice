package level2;
//모음사전

import java.util.ArrayList;

public class Test240223_01 {

//	char[] word = { 'A', 'E', 'I', 'O', 'U' };

//	public int main() {
////		int answer = 0;
//		ArrayList<String> dict = new ArrayList<>();
//		
//		for(int i=0;i<) {
//			dfs();
//		}
//	}//main
//	
//	void dfs() {
//		
//	}

	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		dfs("", 0);
		System.out.println("result:   " + list.indexOf("AAAE"));
		
	}

	public static void dfs(String str, int len) {
		if (len > 5) {
			return;
		}
		list.add(str);
		for (int i = 0; i < 5; i++) {
			dfs(str + "AEIOU".charAt(i), len + 1);// A AA AAA AAAA AAAAA AAAAE
		}
	}

}
