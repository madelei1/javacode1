package Tree;

public class Solution_101 {
    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     * @param root
     * @return
     * 思路：先判断左树的左树和右树的右树是否为对称的，--左树的右树与，右树的左树是否对称即可。
     */
    public boolean isSymmetricChild(TreeNode leftRoot,TreeNode rightRoot) {
        if (rightRoot == null && leftRoot ==null) {
            return true;
        }
        if (rightRoot == null ||leftRoot == null) { //这段要在上面，如果在下面那个下面可能出现空指针异常。
            return false;
        }
        if (rightRoot.val != leftRoot.val) {
            return false;
        }

        return isSymmetricChild(rightRoot.left,leftRoot.right) &&isSymmetricChild(rightRoot.right,leftRoot.left);

    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
}
