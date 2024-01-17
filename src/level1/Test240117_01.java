package level1;
//붕대감기

public class Test240117_01 {
	public static void main(String[] args) {

//		int[] bandage = { 5, 1, 5 };// 시전 시간, 초당 회복량, 추가 회복량
//		int[][] attacks = { { 2, 10 }, { 9, 15 }, { 10, 5 }, { 11, 5 } }; // 공격시간,피해량
//		int health = 30;// 최대체력

		int[] bandage = { 3, 2, 7 };// 시전 시간, 초당 회복량, 추가 회복량
		int[][] attacks = { { 1, 15 }, { 5, 16 }, { 8, 6 } }; // 공격시간,피해량
		int health = 20;// 최대체력

		// 공격잇으면 현재체력에서 피해량만큼 빼고 연속성공은0
		// 공격없으면 +초당회복량
		// 시전시간만큼 연속성공하면 +초다회복량+추가회복량

		int cur_health = health;
		int cur_time = 0;// 현재 몇초
		int conti_time = 0;// 몇초 연속인지
		int result = 0;

		for (int[] k : attacks) {
			while (true) {
				cur_time++;
//			System.out.println(k[0]);//차례대로 2 9 10 11
				if (cur_time == k[0]) {// 공격받은 시간이면
					cur_health -= k[1]; // 30-10
					conti_time = 0;// 공격받으면 연속시간 초기화
					if (cur_health <= 0) {// 공격받았을때 0보다 작아지면 바로 끝내
						result = -1;
						break;
					}
					break;

				} // 공격받은거 체크되면 무한루프 탈출
				else {// 공격받은 시간 아니면 1씩 증가
					conti_time++;// 연속시간 체크 / 나중에 공격당하면 초기화
					cur_health = cur_health + bandage[1];// 여기서 31이 됨...

					if (conti_time == bandage[0]) {
						cur_health += bandage[2];
						conti_time = 0;// 연속수당 주고나면 초기화
					}
					if (cur_health > health) {
						cur_health = health;
					}
				}

			} // while 무한루프
			if (cur_time == attacks[attacks.length - 1][0] && result != -1) {
				result = cur_health;
			}

		} // 확장된 for
	}
}
