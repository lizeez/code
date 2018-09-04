package saimawang;

import java.io.IOException;
import java.util.HashMap;

public class Test4 {
	public static void main(String[] args) throws IOException {
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		int c;
		while((c=System.in.read())!='\n') {
			map1.put(c,map1.getOrDefault(c,0)+1);
		}
		while((c=System.in.read())!='\n') {
			map2.put(c,map2.getOrDefault(c,0)+1);
		}
		int flag =1;
  		for(Integer s : map2.keySet())
			if(map1.get(s)==null || map1.get(s) < map2.get(s))
            {
            	flag = 0;break;
            }
  		System.out.println(flag);
	}
	
	
}
