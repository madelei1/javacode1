package Review_tree;

import static java.lang.Math.abs;

public class Solution_110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     *
     * 本题中，一棵高度平衡二叉树定义为：
     * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        int x = maxDepth(root.left);
        int y = maxDepth(root.right);

        return Math.abs(x - y) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int x = maxDepth(root.left);
        int y = maxDepth(root.right);
        return x > y ? x + 1 : y + 1;

    }
}

