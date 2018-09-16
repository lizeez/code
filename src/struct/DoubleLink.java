package struct;

public class DoubleLink<T> {
	
	//��ͷ
	private DNode<T> mHead;
	//������
	private int mCount;
	
	private class DNode<T>{
		public DNode prev;
		public DNode next;
		public T value;
		
		public DNode(T value, DNode prev, DNode next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
	
	//���캯��
	public DoubleLink() {
		//������ͷ����ͷ���洢����
		mHead = new DNode<T>(null, null, null);
		mHead.prev = mHead.next = mHead;
		//��ʼ���ڵ����Ϊ0
		mCount = 0;
	}
	
	//���ؽڵ����
	public int size() {
		return mCount;
	}
	
	//���������Ƿ�Ϊ��
	public boolean isEmpty() {
		return mCount == 0;
	}
	
	//��ȡ��indexλ�õĽڵ�
	private DNode<T> getNode(int index){
		if(index < 0 || index >= mCount)
			throw new IndexOutOfBoundsException();
		//�������
		if(index <= mCount/2) {
			DNode<T> node = mHead.next;
			for(int i=0; i<index; i++)
				node = node.next;
			return node;
		}
		
		DNode<T> rnode = mHead.prev;
		int rindex = mCount - index - 1;
		for(int j=0; j<rindex; j++)
			rnode = rnode.prev;
		
		return rnode;
		
	}
	
	//��ȡ��indexλ�õĽڵ��ֵ
	public T get(int index) {
		return getNode(index).value;
	}
	
	//��ȡ��һ���ڵ�
	public T getFirst() {
		return getNode(0).value;
	}
	
	//��ȡ���һ���ڵ�
	public T getLast() {
		return getNode(mCount-1).value;
	}
	
	//���ڵ���뵽��index֮ǰ
	public void insert(int index, T t) {
		if(index == 0) {
			DNode<T> node = new DNode<T>(t, mHead, mHead.next);
			mHead.next.prev = node;
			mHead.next = node;
			mCount++;
			return;
		}
		
		DNode<T> inode = getNode(index);
		DNode<T> tnode = new DNode<T>(t, inode.prev, inode);
		inode.prev.next = tnode;
		inode.prev = tnode;
		mCount++;
		return;
	}
	
	//���ڵ�����һ���ڵ㴦
	public void insertFirst(T t) {
		insert(0, t);
	}
	//���ڵ�׷�ӵ�ĩβ
	public void appendLast(T t) {
		DNode<T> node = new DNode<T>(t, mHead.prev, mHead);
		mHead.prev.next = node;
		mHead.prev = node;
		mCount++;
	}
	
	
	//ɾ��indexλ�õĽڵ�
	public void del(int index) {
		DNode<T> inode = getNode(index);
		inode.prev.next = inode.next;
		inode.next.prev = inode.prev;
		inode = null;
		mCount--;
	}
	
	//ɾ����һ���ڵ�
	public void delectFirst() {
		del(0);
	}
	
	//ɾ�����һ���ڵ�
	public void delectLast() {
		del(mCount-1);
	}
}
