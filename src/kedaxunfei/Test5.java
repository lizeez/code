package kedaxunfei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		int count = findNumber(list);
		System.out.println(count);
	}

	private static int findNumber(List list) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		int tem = (int)list.get(0);
		list1.add(tem);
		for(int i=0; i<list.size()-1; i++) {
			tem = (int)list.get(i);
			int tem1 = (int)list.get(i+1);
			if(tem <= tem1)
				list1.add(tem1);
		}
		if(list.size() != list1.size()) {
				return findNumber(list1)+1;
		}
		return 0;
	}
}
