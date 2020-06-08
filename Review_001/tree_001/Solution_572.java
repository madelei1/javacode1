package Review_001.tree_001;

public class Solution_572 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null || t == null) {
            return false;
        }
        if(isSubtreechild(s,t)) {
            return true;
        }
        if(isSubtree(s.left,t)) {
            return true;
        }
        if(isSubtree(s.right,t)) {
            return true;
        }
        return false;

    }
    public boolean isSubtreechild(TreeNode s, TreeNode t) {

        if(s == null && t == null) {
            return true;
        }
        if(s == null) {
            return false;
        }
        if(t == null) {
            return false;
        }
        if(s.val != t.val) {
            return false;
        }
        return isSubtreechild(s.left,t.left) && isSubtreechild(s.right,t.right);
    }

}
