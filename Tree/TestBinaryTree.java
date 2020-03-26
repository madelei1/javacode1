package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TestBinaryTree {

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
        System.out.print(root.value+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    //中序遍历
    void inOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value+" ");
        inOrderTraversal(root.right);

    }

    //后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value+" ");
    }
    //节点的个数--节点的个数 = 左子树 + 右子树 +1
    int getSize2(Node root){
        if (root == null) {
            return 0;
        }
        return getSize2(root.right) +getSize2(root.left) +1;
    }
    //遍历中计算节点的个数
    int getSize1(Node root){

        return 0;
    }
    //叶子的个数 = 左子树的叶子节点 + 右子树的叶子节点
    int getLeafSize2(Node root){
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.right) +getLeafSize2(root.left);

    }
    void getLeafSize1(Node root){

    }
    //第k层的节点个数
    int getKLevelSize(Node root,int k){
        if (root == null || k <= 0) {
            return 0;
        }
        if(k == 1) {
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
        if (root.value == val) {
            return root;
        }
        Node ret = find(root.left,val);
        if(ret != null) {
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null) {
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
        int x = getHeight(root.left);
        int y = getHeight(root.right);
        return x > y ? x + 1 : y + 1;

    }
    //中序遍历---思路：建立一个队列，将根放进去，然后弹出队列，弹出的时候将弹出节点的左节点和由节点放入进去。
     void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node x = queue.poll();
            if (x != null) {
                System.out.print(x.value+ " ");
            }
            if (x.left != null) {
                queue.offer(x.left);
            }
            if (x.right != null) {
                queue.offer(x.right);
            }
        }
    }
    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(Node root) {
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node x = queue.poll();
            if (x == null) {
                while (!queue.isEmpty()) {
                    if (queue.poll() != null) {
                        return false;
                    }
                }
            } else {
                queue.offer(x.left);
                queue.offer(x.right);
            }
        }
        return true;
    }


}
