package Review_001.tree_001;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        System.out.println(binaryTree.getSize1(binaryTree.createTree()));
        System.out.println(binaryTree.getSize2(binaryTree.createTree()));
        System.out.println(binaryTree.getLeafSize2(binaryTree.createTree()));
        binaryTree.getLeafSize1(binaryTree.createTree());
        System.out.println(BinaryTree.leafSize);
        System.out.println(binaryTree.getHeight(binaryTree.createTree()));
    }
}
