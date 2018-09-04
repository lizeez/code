package test;

import java.util.Stack;

public class Test5 {
	public static void main(String[] args) {
		Stack<Integer> iStack = new Stack<Integer>();
		iStack.push(0);
		iStack.push(1);
		
		for(int i=0; i<5; i++) {
			
			int f2 = iStack.pop();
			int f1 = iStack.pop();
			
			int tem = f1 + f2;
			
			iStack.push(f1);
			iStack.push(f2);
			iStack.push(tem);
		}
		
		while(!iStack.empty()) {
			System.out.println(iStack);
			iStack.pop();
		}
	}
}
