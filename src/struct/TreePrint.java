package struct;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 分层打印二叉树
 * 
 * @Builder Create By Arno
 * @Email admin@happy-dev.com
 * @Time 2017年5月1日
 */
public class TreePrint {

    public static void print(BinaryTree root) {
        // 创建一个队列用来存放节点
        Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
        // 当前行打印的最右节点
        BinaryTree last;
        // 下一行打印的最右节点
        BinaryTree nlast = null;
        last = root;
        // 先将根放入队列中
        queue.add(root);
        // 队列不为空时，就一直循环poll直到队列为空
        while (queue.size() > 0) {
            // 推出节点
            BinaryTree nowTree = queue.poll();
            // 如果当前节点有左节点，将左节点压入队列中
            if (nowTree.hasLeftNode()) {
                queue.add(nowTree.getLeftNode());
                nlast = nowTree.getLeftNode();
            }
            // 如果当前节点有右节点，将左节点压入队列中
            if (nowTree.hasRightNode()) {
                queue.add(nowTree.getRightNode());
                nlast = nowTree.getRightNode();
            }
            System.out.print("  " + nowTree.getValue());
            // 当当前打印节点为当前行最右节点时换行
            if (last.equals(nowTree)) {
                System.out.println();
                last = nlast;
            }
        }

    }

    /**
     *测试用
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
     * 节点值
     */
    private String value;
    /**
     * 左节点
     */
    private BinaryTree leftNode;
    /**
     * 右节点
     */
    private BinaryTree rightNode;

    /**
     * 默认无参构造
     */
    public BinaryTree() {

    }

    /**
     * 初始化value的构造
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
     * 判断是否有左节点
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
     * 判断是否有右节点
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
