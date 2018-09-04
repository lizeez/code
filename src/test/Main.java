package test;

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String queue = sc.next();
		int lCount = 0, rCount = queue.length() - 1, count = 0;
		for(int i=0; i<queue.length()-1; i++) {
			if(queue.charAt(i) == 'R') {
				break;
			}
			lCount++;
		}
		for(int j=queue.length()-1; j>=0; j--) {
			if(queue.charAt(j) == 'L') {
				break;
			}
			rCount--;
		}
		System.out.println(lCount + " " + rCount);
		count = queue.length() - (rCount - lCount);
		if(count > queue.length()) {
			count = queue.length();
		}
		System.out.println(count);
	}
}