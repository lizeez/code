package saimawang;

import java.util.Scanner;

public class Test6{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int x = s.nextInt();
		int p = s.nextInt();
		int q = s.nextInt();
		s.close();
		
		double y = (double)(x*p)/(q*(n+1)-n*p);
		if(y > m){
			y=m;
		}
		if(y < 1){
			y=1;
		}
		System.out.printf("%.2f",y);
	}
}