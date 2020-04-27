package Review_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestBinaryTree {
    class Node {
        Node left;
        Node right;
        int val;
        public Node(char value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }

    public Node createTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;



    }
    //前序遍历
    void preOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    //中序遍历
    void inOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }


    //后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }
    //节点的个数
    int getSize2(Node root){
        if (root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) +1;

    }
    //叶子的个数
    int getLeafSize2(Node root){
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    //第k层的节点个数
    int getKLevelSize(Node root,int k){
        if (root == null || k < 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.right,k-1)+getKLevelSize(root.left,k-1);

    }
    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, int val){
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        Node ret ;
        ret = find(root.left,val);
        if (ret != null) {
            return ret;
        }
        ret = find(root.right,val);
        if (ret != null) {
            return ret;
        }
        return null;
    }
    // 获取二叉树的高度
    //先判断左树的高度，在判断右树的高度，最大的为高度
    int getHeight(Node root){
        if (root == null) {
            return 0;
        }
        return getHeight(root.left) > getHeight(root.right) ? getHeight(root.left) +1: getHeight(root.right) +1;
    }
    //中序遍历
    void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (queue != null) {
            Node node = queue.peek();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.left != null) {
                queue.offer(node.right);
            }
            System.out.print(queue.poll());
        }
    }
    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(Node root) {
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.isEmpty()) {
            Node node = queue.poll();
            if (node == null) {
                while (queue.isEmpty()) {
                    if (queue.poll() != null) {
                        return false;
                    }
                }
            } else {
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return true;
    }
    // 前序遍历
    void preOrderTraversalNor(Node root) {
        if(root == null) {
            return;
        }
        Node node = root;
        Stack<Node> stack = new Stack<>();

        while (node != null ||!stack.isEmpty()) {
            stack.push(node);
        }
    }



}
