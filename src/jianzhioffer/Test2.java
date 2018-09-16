package jianzhioffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	private static int count = 0;
	private static int count1 = 0;
	private static List<Integer> list = new ArrayList();
	private static List<Integer> list1 = new ArrayList();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			int n = sc.nextInt();
			count += n;
			for(int i=0; i<n; i++) {
				list.add(sc.nextInt());
			}
			System.out.println(list.get((count+1)/2));
		}
	}
}
