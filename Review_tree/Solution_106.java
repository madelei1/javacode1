package Review_tree;

public class Solution_106 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int index = 0;
    public TreeNode buildTreeChild(int[] inorder, int[] postorder,int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[index]);
        int x = findRootIndexOnInorder(inorder,postorder[index],start,end);
        index --;
        if (x == -1) {
            return null;
        }
        root.right = buildTreeChild(inorder,postorder,x+1,end);
        root.left = buildTreeChild(inorder,postorder,start,x-1);

        return root;
    }
    public int findRootIndexOnInorder(int[] inorder,int val, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) {
            return null;
        }
        index = postorder.length-1;
        return buildTreeChild(inorder,postorder,0,inorder.length-1);
    }
}
