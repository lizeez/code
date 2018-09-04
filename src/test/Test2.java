package test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String queue = sc.next();
		int count =  queue.length() - (queue.lastIndexOf("L") - queue.indexOf("R"));
		System.out.println(count);
	}
}
