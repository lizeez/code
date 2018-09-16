package meituan;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i]  = sc.nextInt();
		}
		getResult(a);
	}

	private static void getResult(int[] a) {
		// TODO Auto-generated method stub
		int len = a.length;
		if(len == 0 || len == 1) {
			System.out.println("NO");
		}
		int max = a[0], sum = a[0];
		for(int i=1; i<len; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			sum += a[i];
		}
		if(sum >= 2*max) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
