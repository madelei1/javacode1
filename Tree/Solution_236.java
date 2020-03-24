package Tree;

public class Solution_236 {
    /**
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，
     * 最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大
     * （一个节点也可以是它自己的祖先）。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param root
     * @param p
     * @param q
     * @return
     * 思路：判断根是不是p或者q中的某一个节点
     * 1、如果是你们当前根就是p和q的工给祖先
     * 2、如果不是，那么分别去根的左右找，
     * 3、如果左边不为空，右边也不为空，那么根就是公共祖先，
     * 4、如果左边为空，右边不为空，那么右边遇到第一个节点就是公共祖先，
     * 5、如果右边为空，左边不为空，那么左边遇到第一个节点就是公共祖先。
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
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null && right == null) {
            return left;
        }
        if (left == null && right != null) {
            return right;
        }
        return null;
    }
}
