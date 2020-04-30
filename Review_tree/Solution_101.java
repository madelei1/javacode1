package Review_tree;

public class Solution_101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     *
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetricChild(root.left,root.right);


    }
    public boolean isSymmetricChild(TreeNode leftRoot,TreeNode rightRoot) {
        if (leftRoot == null && rightRoot == null) {
            return true;
        }
        if (rightRoot == null) {
            return false;
        }
        if (leftRoot == null) {
            return false;
        }
        if (leftRoot.val != rightRoot.val) {
            return false;
        }
        return isSymmetricChild(leftRoot.left,rightRoot.right) && isSymmetricChild(rightRoot.left,leftRoot.right);

    }
}
