package Review_001.tree_001;

public class BinaryTree {
    class Node {
        char val;
        Node left;
        Node right;

        public Node(char val) {
            this.val = val;
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
    // 前序遍历
    void preOrderTraversal(Node root){
        if ( root == null) {
            return;
        }
        System.out.print(root.val+" ");
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);

    }
    // 中序遍历
    void inOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    void postOrderTraversal(Node root){

        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");

    }
    // 遍历思路-求结点个数
     static int size = 0;
    int getSize1(Node root){
        if (root == null) {
            return 0;
        }
        size ++;
        getSize1(root.left);
        getSize1(root.right);
        return size;
    }
    static int x = 0;
    // 子问题思路-求结点个数
    int getSize2(Node root){
        if (root == null) {
            return 0;
        }
        return getSize2(root.left)+getSize2(root.right)+1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(Node root){

        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafSize ++;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
        return ;
    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(Node root){

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }
    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(Node root,int k){

        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }
    // 获取二叉树的高度
    int getHeight(Node root){
        if (root == null) {
            return 0;
        }
        int x = getHeight(root.left)+1;
        int y = getHeight(root.right)+1;
        return x > y ? x : y;
    }
    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, char val){
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        /*find(root.left,val);
        find(root.right,val);*/
        //题目要求找到就不要在照了，所以上面书写不符合要求。
        Node ret = find(root.left,val);
        if (ret != null) {
            return ret;
        }
        Node ret1 = find(root.right,val);
        if (ret1 != null) {
            return ret1;
        }

        return null;
    }
}
