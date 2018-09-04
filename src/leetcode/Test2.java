package leetcode;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		int k = (n-1)/3;
		for(int i=0; i<2*k; i=i+2) {
			for(int j=0; j<i/2;j++) {
				System.out.print(" ");
			}
			System.out.print(str.charAt(i));
			for(int j=0; j<2*k - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println(str.charAt(i+1));
		}
		for(int i=2*k; i<n; i++) {
			for(int j=0; j<k;j++) {
				System.out.print(" ");
			}
			System.out.println(str.charAt(i));
		}
	}
}
