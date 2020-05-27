package Review_mapAndset;

public class Test {
    /**
     * 测试二叉搜索树
     * @param args
     */
    public static void main(String[] args) {

        int[] array = {5,3,4,1,7,8,2,6,0,9};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int val : array) {
            binarySearchTree.insert(val);
        }
        System.out.println(binarySearchTree.insert(5));
        System.out.println(binarySearchTree.search(5));
        binarySearchTree.remove(1);
        binarySearchTree.remove(9);
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println();
        /*int x = 4;
        int y = x << 1;
        System.out.println(y);
*/
    }
}
