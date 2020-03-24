package Tree;

public class Solution_110 {
    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     *
     * 本题中，一棵高度平衡二叉树定义为：
     *
     * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
     * @param root
     * @return
     * 思路：判断左树的高度，在判断右树的高度--相减的绝对值要小于等于1，他们的子树也是这样。
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int x = maxDepth(root.left);
        int y = maxDepth(root.right);
        return x > y ? x + 1 : y + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int a = maxDepth(root.left);
        int b = maxDepth(root.right);
        return Math.abs(a - b)<=1 && isBalanced(root.right) && isBalanced(root.left);
    }
}
