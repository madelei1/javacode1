package Tree;

public class Solution_105 {
    /**
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     * @param preorder
     * @param inorder
     * @return
     * 思路：顺序遍历前序数组，在中序数组中查找到前序遍历的字符，分为左子树和右子树，依次类推，其子树。
     */
    public int index = 0;
    public TreeNode buildTreeChild(int[] preorder, int[] inorder,int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[index]);
        int rootIndex = findRootIndexOnInorder(inorder,preorder[index],start,end);
        index ++;
        if (rootIndex == -1) {
            return null;
        }
        root.left = buildTreeChild(preorder,inorder,start,rootIndex-1);
        root.right = buildTreeChild(preorder,inorder,rootIndex+1,end);
        return root;
    }
    public int findRootIndexOnInorder(int[] inorder,int val, int start, int end) {
        for (int i = start;i <= end;i ++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null) {
            return  null;
        }
        return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }
}
