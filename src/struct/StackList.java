package struct;

import java.util.Stack;

/**
 * �á�ջ��ʵ�ֶ���
 *
 * @author skywang
 */
public class StackList<T> {

    // ������������ʱ��(01) �������е�ȫ�����ݡ����Ƶ�mIn�С� (02) ��������ӵ����ݡ���ӵ�mIn�С�
    private Stack<T> mIn  = null;
    // �Ӷ��л�ȡԪ��ʱ��(01) �������е�ȫ�����ݡ����Ƶ�mOut�С�(02) ���ز�ɾ��mOutջ��Ԫ�ء�
    private Stack<T> mOut = null;
    // ͳ�Ƽ���
    private int mCount = 0;

    public StackList() {
        mIn = new Stack<T>();
        mOut = new Stack<T>();
        mCount = 0;
    }

    private void add(T t) {
        // �������е�ȫ�����ݡ����Ƶ�mIn��
        while (!mOut.empty())
            mIn.push(mOut.pop());

        // ��������ӵ����ݡ���ӵ�mIn��
        mIn.push(t);
        // ͳ����+1
        mCount++;
    }

    private T get() {
        // �������е�ȫ�����ݡ����Ƶ�mOut��
        while (!mIn.empty())
            mOut.push(mIn.pop());
        // ͳ����-1
        mCount--;

        // ���ز�ɾ��mOutջ��Ԫ��
        return mOut.pop();
    }

    private int size() {
        return mCount;
    }
    private boolean isEmpty() {
        return mCount==0;
    }

    public static void main(String[] args) {
        StackList slist = new StackList();

        // ��10, 20, 30 ��������ջ��
        slist.add(10);
        slist.add(20);
        slist.add(30);

        System.out.printf("isEmpty()=%b\n", slist.isEmpty());
        System.out.printf("size()=%d\n", slist.size());
        while(!slist.isEmpty()) {
            System.out.printf("%d\n", slist.get());
        }
    }
}
