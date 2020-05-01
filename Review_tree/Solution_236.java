package Review_tree;

public class Solution_236 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
     *
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，
     * 最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大
     * （一个节点也可以是它自己的祖先）。”
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p == null || q == root) {
            return q;
        }
        if (q == null || p == root) {
            return p;
        }
        TreeNode node = lowestCommonAncestor(root.left,p,q);
        TreeNode node1 = lowestCommonAncestor(root.right,p,q);
        if (node != null && node1 == null) {
            return node;
        }
        if (node1 != null && node == null) {
            return node1;
        }
        if (node != null && node1 != null) {
            return root;
        }
        return null;

    }
}
