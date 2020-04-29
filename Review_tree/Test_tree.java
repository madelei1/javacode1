package Review_tree;

public class Test_tree {
    public static void main(String[] args) {
        TestBinaryTree testBinaryTree = new TestBinaryTree();
        TestBinaryTree.Node root = testBinaryTree.createTree();
        testBinaryTree.levelOrderTraversal(root);
        System.out.println();
        testBinaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.println("============");
        testBinaryTree.preOrderTraversalNor(root);
        System.out.println();
        System.out.println("============");
        testBinaryTree.inOrderTraversalNor(root);
        System.out.println();
        System.out.println("============");
        testBinaryTree.inOrderTraversal(root);
        System.out.println();
        testBinaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println("===================");
        testBinaryTree.postOrderTraversalNor(root);
        System.out.println();

        System.out.println(testBinaryTree.getSize2(root));
        System.out.println("-----------------");
        testBinaryTree.getLeafSize2(root);
        System.out.println(testBinaryTree.getKLevelSize(root,3));
        System.out.println(testBinaryTree.isCompleteTree(root));
        System.out.println("--------------------------");
        System.out.println(testBinaryTree.getHeight(root));
    }
}
