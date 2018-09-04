package huawei;

import java.util.Scanner;
import java.util.Stack;

public class Huawei23 {
	private static char[] array = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            .toCharArray();
    private static String numStr = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
    //十进制转换为其他进制，出留取余，逆序排列
	public static String tenToN(long number, int N) {
    
    	Stack<Character> stack = new Stack<Character>();
    	StringBuilder result = new StringBuilder(0);
    	while(number != 0) {
    		stack.add(array[(int)(number % N)]);
    		number = number / N;
    	}
    	
    	while(!stack.isEmpty()) {
    		result.append(stack.pop());
    	}
    	
    	return result.length() == 0 ? "0" : result.toString();
    }
	
	//其他进制转化为10进制，按权展开
	public static long NToTen(String number, int N) {
		char ch[] = number.toCharArray();
		long result = 0;
		if(N == 10) {
			return Long.parseLong(number);
		}
		long base = 1;
		for(int i=ch.length - 1; i>=0; i--) {
			result += numStr.indexOf(ch[i]) * base;
			base *= N;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int src = in.nextInt();
			int aim = in.nextInt();
			String intStr = in.next();
			
			Long tem = NToTen(intStr, src);
			String tem2 = tenToN(tem, aim);
			
			String newStr = tem2.replaceFirst("^0*", "");
			System.out.println(newStr);
		}
	}
}
