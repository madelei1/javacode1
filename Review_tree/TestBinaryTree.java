package Review_tree;

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





}
