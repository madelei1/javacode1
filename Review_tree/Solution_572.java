package Review_tree;

import java.util.Stack;

public class Solution_572 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
     * s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/subtree-of-another-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @param t
     * @return
     */

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return false;
        }
        if (isSubtreeChild(s,t)) {
            return true;
        }
        //通过条件来递归，，，，
        if (isSubtree(s.left,t)) {
            return true;
        }
        if (isSubtree(s.right,t)) {
            return true;
        }
        return false;
    }

    /**
     * 整个方法判断t和s是不是相同
     * @param s
     * @param t
     * @return
     */
    public boolean isSubtreeChild(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }
        if (t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return isSubtreeChild(s.left,t.left) && isSubtreeChild(s.right,t.right);
    }

}
