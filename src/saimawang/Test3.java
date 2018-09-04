package saimawang;

import java.util.* ;

public class Test3 {
	public static int solution(int n) {
		if (n < 2)
			return n + 1;
		int n_pair = (int)Math.floor((Math.sqrt(8 * n + 9) - 3) / 2);
		int day = ((n_pair + 3) * n_pair) >> 1;
		int price = ((n_pair - 1) * n_pair) >> 1;
		return price + 1 + n - day;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println(solution(sc.nextInt() - 1));
		}
	}
}


