package Tree;

public class Solution_104 {
    /**
     * 给定一个二叉树，找出其最大深度。
     *
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     * @param root
     * @return
     * 思路：--判断左树的深度--在判断右树的深度-- 比较大小，最大的数加1（根节点）为最大深度
     */

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int x = maxDepth(root.left);
        int y = maxDepth(root.right);
        int max = x > y ? x + 1 : y + 1;
        return max;
    }
}
