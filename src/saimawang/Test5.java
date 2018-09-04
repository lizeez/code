package saimawang;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int total = n;
			int num = scanner.nextInt();
			int time = 0;
			int[] a = new int[num+1];
			for(int i=0; i<=num; i++) {
				a[i] = scanner.nextInt();
				if(a[i] > n) {
					System.out.println(0);
					return;
				}
			}
			for(int i=0; i<num; i++) {
				n -= a[i];
				if(n>=a[i+1]) {
					continue;
				}else {
					n = total;
					time++;
				}
			}
			System.out.println(time);
		}
	}
	
}
