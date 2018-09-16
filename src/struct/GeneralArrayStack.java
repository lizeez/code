package struct;

import java.lang.reflect.Array;

public class GeneralArrayStack<T> {
	
	private static final int DEFAULT_SIZE = 12;
	private T[] mArray;
	private int count;
	
	public GeneralArrayStack(Class<T> type) {
		this(type, DEFAULT_SIZE);
	}

	public GeneralArrayStack(Class<T> type, int size) {
		// TODO Auto-generated constructor stub
		mArray = (T[]) Array.newInstance(type, size);
		count = 0;
	}
	
	public void push(T val) {
		mArray[count++] = val;
	}
	
	public T peek() {
		return mArray[count-1];
	}
	
	public T pop() {
		T ret = mArray[count-1];
		count--;
		return ret;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void PrintArrayStack() {
		if(isEmpty()) {
			System.out.println("stack is Empth\n");
		}
		
		System.out.printf("stack size()=%d\n", size());
		
		int i = size() - 1;
		while(i>=0) {
			System.out.println(mArray[i]);
			i--;
		}
	}
	
	public static void main(String[] args) {
		String tmp;
		GeneralArrayStack<String> astack = new GeneralArrayStack<String>(String.class);
		astack.push("10");
		astack.push("20");
		astack.push("30");
		
		tmp = astack.pop();
		System.out.println("tmp" + tmp);
		
		tmp = astack.peek();
		System.out.println("tmp" + tmp);
		
		astack.push("40");
		astack.PrintArrayStack();
		
		
		
	}
}
