package struct;

public class ArrayQueue {
	private int[] mArray;
	private int mCount;
	
	public ArrayQueue(int sz) {
		mArray = new int[sz];
		mCount = 0;
	}
	
	public void add(int val) {
		mArray[mCount++] = val;
	}
	
	public int front() {
		return mArray[0];
	}
	
	public int pop() {
		int ret = mArray[0];
		mCount--;
		for(int i=1; i<=mCount; i++) {
			mArray[i-1] = mArray[i];
		}
		return ret;
	}
	
	public int size() {
		return mCount;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public static void main(String[] args) {
		int tmp;
		ArrayQueue astack = new ArrayQueue(12);
		
		astack.add(10);
		astack.add(20);
		astack.add(30);
		
		tmp = astack.pop();
		
		System.out.printf("tmp=%d\n", tmp);
		
		tmp = astack.front();
		System.out.printf("tmp=%d\n", tmp);
		
		astack.add(40);
		
		System.out.printf("isEmpty()=%b\n", astack.isEmpty());
		System.out.printf("size()=%d\n", astack.size());
		while (!astack.isEmpty()) {
			System.out.printf("size()=%d\n", astack.pop());
		}
		}
	
}
