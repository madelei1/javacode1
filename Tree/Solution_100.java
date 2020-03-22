package Tree;

public class Solution_100 {
    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     *
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的
     * @param p
     * @param q
     * @return
     * 思路：判断2个二叉树是否相同--判断根是否相同 -> 左子树是否相同 -> 右子树是否相同
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return  true;
        }
        if (p == null) {
            return false;
        }
        if (q == null) {
            return false;
        }
        if (p.val == q.val) {
            if (!isSameTree(p.left,q.left)) {
                return false;
            }
            if (!isSameTree(p.right,q.right)){
                return false;
            }

        } else {
            return false;
        }
        return true;

    }
}
