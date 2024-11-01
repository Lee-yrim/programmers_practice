package level1;

public class Test231129_02 {
	public static void main(String[] args) {
		
		int answer = 0;
		int cnt=0;
		
		int a=2, b=1, n=20;
//		int a=3, b=1, n=20;
//		int a=2, b=3, n=20;
		
		while(n>=a) {
			n=(n/a)*b+(n%a);
			cnt=(n/a)*b;
			answer+=cnt;
		}
		System.out.println(answer);
	}

}
