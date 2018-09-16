package wangyi;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int k = sc.nextInt();
		int[] height = new int[n];
		for(int i=0; i<n; i++) {
			height[i] = sc.nextInt();
		}
		int count = 0;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=0; i<k; i++) {
			int h = max(height);
			int l = max(height);
			if(balance(height[h], height[l])) {
				break;
			}
			count++;
			height[h]--;
			height[l]++;
			list1.add(h+1);
			list2.add(l+1);
		}
		System.out.println(max(height) - min(height) + " " + count);
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i)+" "+list2.get(i));
		}
		sc.close();
	}
	
	public static int max(int[] height) {
		int h = 0;
		int max = height[0];
		for(int i=1; i<height.length; i++) {
			if(max < height[i]) {
				h = i;
				max = height[i];
			}
		}
		return h;
	}
	
	public static int min(int[] height) {
		int h = 0;
		int min = height[0];
		for(int i=1; i<height.length; i++) {
			if(min > height[i]) {
				h = i;
				min = height[i];
			}
		}
		return h;
	}
	
	public static boolean balance(int hval, int lval) {
		boolean flag = false;
		int x = hval - lval;
		if(x<=1)
			flag = true;
		return flag;
	}
}
