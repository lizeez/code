package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<String>> map = new TreeMap<String, List<String>>();
		int n = sc.nextInt();
		//String str = Integer.toBinaryString(n);
		for(int i=0; i<n; i++) {
			String time = sc.next(), code = sc.next();
			if(!map.containsKey(time))
				map.put(time, new ArrayList<String>());
			map.get(time).add(code);
		}
		for(String time : map.keySet()) {
			if(map.get(time).size()>1) {
				System.out.printf(time);
				for(String code : map.get(time)) {
					System.out.printf(" " + code);
				}
				System.out.printf("\n");
			}
		}
	}
}
