package struct;

import java.util.LinkedList;
import java.util.Queue;

/**
 * �ֲ��ӡ������
 * 
 * @Builder Create By Arno
 * @Email admin@happy-dev.com
 * @Time 2017��5��1��
 */
public class TreePrint {

    public static void print(BinaryTree root) {
        // ����һ������������Žڵ�
        Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
        // ��ǰ�д�ӡ�����ҽڵ�
        BinaryTree last;
        // ��һ�д�ӡ�����ҽڵ�
        BinaryTree nlast = null;
        last = root;
        // �Ƚ������������
        queue.add(root);
        // ���в�Ϊ��ʱ����һֱѭ��pollֱ������Ϊ��
        while (queue.size() > 0) {
            // �Ƴ��ڵ�
            BinaryTree nowTree = queue.poll();
            // �����ǰ�ڵ�����ڵ㣬����ڵ�ѹ�������
            if (nowTree.hasLeftNode()) {
                queue.add(nowTree.getLeftNode());
                nlast = nowTree.getLeftNode();
            }
            // �����ǰ�ڵ����ҽڵ㣬����ڵ�ѹ�������
            if (nowTree.hasRightNode()) {
                queue.add(nowTree.getRightNode());
                nlast = nowTree.getRightNode();
            }
            System.out.print("  " + nowTree.getValue());
            // ����ǰ��ӡ�ڵ�Ϊ��ǰ�����ҽڵ�ʱ����
            if (last.equals(nowTree)) {
                System.out.println();
                last = nlast;
            }
        }

    }

    /**
     *������
     * @param args
     */
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree();
        root.setValue("root");
        BinaryTree left01 = new BinaryTree("left01");
        BinaryTree right01 = new BinaryTree("right01");
        root.setLeftNode(left01);
        root.setRightNode(right01);
        BinaryTree left11 = new BinaryTree("left11");
        BinaryTree right11 = new BinaryTree("right11");
        left01.setLeftNode(left11);
        left01.setRightNode(right11);
        BinaryTree left12 = new BinaryTree("left12");
        BinaryTree right12 = new BinaryTree("right12");
        right01.setLeftNode(left12);
        right01.setRightNode(right12);
        print(root);

    }

}

class BinaryTree {
    /**
     * �ڵ�ֵ
     */
    private String value;
    /**
     * ��ڵ�
     */
    private BinaryTree leftNode;
    /**
     * �ҽڵ�
     */
    private BinaryTree rightNode;

    /**
     * Ĭ���޲ι���
     */
    public BinaryTree() {

    }

    /**
     * ��ʼ��value�Ĺ���
     * 
     * @param value
     */
    public BinaryTree(String value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the leftNode
     */
    public BinaryTree getLeftNode() {
        return leftNode;
    }

    /**
     * @param leftNode
     *            the leftNode to set
     */
    public void setLeftNode(BinaryTree leftNode) {
        this.leftNode = leftNode;
    }

    /**
     * @return the rightNode
     */
    public BinaryTree getRightNode() {
        return rightNode;
    }

    /**
     * @param rightNode
     *            the rightNode to set
     */
    public void setRightNode(BinaryTree rightNode) {
        this.rightNode = rightNode;
    }

    /**
     * �ж��Ƿ�����ڵ�
     * 
     * @return boolean
     */
    public boolean hasLeftNode() {
        if (this.leftNode == null || this.leftNode.getValue() == null) {
            return false;
        }
        return true;
    }

    /**
     * �ж��Ƿ����ҽڵ�
     * 
     * @return boolean
     */
    public boolean hasRightNode() {
        if (this.rightNode == null || this.rightNode.getValue() == null) {
            return false;
        }
        return true;
    }
    }
