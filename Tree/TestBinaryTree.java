package Tree;

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

}
