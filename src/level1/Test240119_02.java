package level1;
//바탕화면 정리

public class Test240119_02 {
	public static void main(String[] args) {

		// (가장위쪽의 세로,가장왼의 가로, 가장아래의세로, 가장오른의가로)

		// 돌면서 #나오면 그 위치의 세로 가로랑 비교해서 큰놈 작은놈 저장

//		String[] wallpaper = { ".#...", "..#..", "...#." };
//		String[] wallpaper = { "..........", ".....#....", "......##..", "...##.....", "....#....." };
//		String[] wallpaper = { ".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
		String[] wallpaper = { "..", "#." };
		int lux = 50;
		int luy = 50;
		int rdx = 0;
		int rdy = 0;

		int[] result = new int[4];

		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				if (wallpaper[i].charAt(j) == '#') {
					lux = Math.min(i, lux);// ??...하면 최소가 무조건 0..?아오케
					luy = Math.min(j, luy);
					rdx = Math.max(rdx, i);
					rdy = Math.max(rdy, j);
				} // if
			} // if j
		} // if i
		System.out.println(lux);
		System.out.println(luy);
		System.out.println(rdx + 1);
		System.out.println(rdy + 1);
		result[0] = lux;
		result[1] = luy;
		result[2] = rdx + 1;
		result[3] = rdy + 1;
	}

}
