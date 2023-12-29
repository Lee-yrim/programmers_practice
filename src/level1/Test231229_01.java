package level1;
//다트게임 / 해결아직

public class Test231229_01 {
	public static void main(String[] args) {
		
		String dartResult="1S2D*3T";
		String num="";
		int[] score=new int[3];
		int idx=0;
		
		for(int i=0;i<dartResult.length();i++) {
			char c=dartResult.charAt(i);
			
			if (c>='0'&&c<='9') {
				num+=String.valueOf(c); //문자 c를 문자열로
			}
			
			else if (c=='S'||c=='D'||c=='T') {
				int numint=Integer.parseInt(num);
				if (c=='S') {
					score[idx]=(int)Math.pow(numint, 1);
				}else if(c=='D') {
					score[idx]=(int)Math.pow(numint, 2);
				}else {
					score[idx]=(int)Math.pow(numint, 3);
				}
			}
			
			else {
				if(c=='*') {
//					score하..............뭐야
					if(idx>=1) {
						score[idx]*=2;
					}else {
						
					}
				}
			}
			
		}//for i
		
	}

}
