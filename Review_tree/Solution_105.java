package Review_tree;

public class Solution_105 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     * @param preorder
     * @param inorder
     * @return
     */
    public int index = 0;
    public TreeNode buildTreeChild(int[] preorder, int[] inorder,int start,int end) {
        if (start > end) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        int x = findRootIndexOnInorder(inorder,preorder[index],start,end);
        index ++;
        if (x == -1) {
            return null;
        }
        root.left = buildTreeChild(preorder,inorder,start,x-1);
        root.right = buildTreeChild(preorder,inorder,x+1,end);
        return root;
    }
    public int findRootIndexOnInorder(int[] inorder,int val, int start, int end) {
        for (int i = start;i <= end;i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }
}
