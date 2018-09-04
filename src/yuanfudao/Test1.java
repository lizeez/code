package yuanfudao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] numbers = new int[n];
			for(int i=0; i<n; i++) {
				numbers[i] = sc.nextInt();
			}
			System.out.println(solve(numbers, n));
		}
		sc.close();
	}

	private static int solve(int[] numbers, int n) {
		// TODO Auto-generated method stub
		int[] dp  = new int[n];
		dp[0] = numbers[0];
		for(int i=1; i<n; i++) {
			dp[i] = dp[i-1] + numbers[i];
		}
		Map<Integer, Integer> dpMap = new HashMap<>();
		dpMap.put(0, 0);
		int maxLen  = 0;
		for(int i=0; i<n; i++) {
			if(!dpMap.containsKey(dp[i])) {
				dpMap.put(dp[i], i + 1);
			}else {
				int len = i - dpMap.get(dp[i]) + 1;
				maxLen = maxLen < len ? len : maxLen;
			}
		}
		return maxLen;
	}
}
