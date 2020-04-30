package Review_tree;

import java.util.Stack;

public class Solution_100 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;
        }

        /**
         * 给定两个二叉树，编写一个函数来检验它们是否相同。
         *
         * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
         * @param p
         * @param q
         * @return
         */
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q != null) {
                return false;
            }
            if (p != null && q == null) {
                return false;
            }
            if (p == null && q == null) {
                return true;
            }
            if (p.val != q.val) {
                return false;
            }
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }

    }
}
