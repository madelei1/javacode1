package Review_tree;

public class Test_tree {
    public static void main(String[] args) {
        TestBinaryTree testBinaryTree = new TestBinaryTree();
        TestBinaryTree.Node root = testBinaryTree.createTree();

        System.out.println(testBinaryTree.getHeight(root));
    }
}
