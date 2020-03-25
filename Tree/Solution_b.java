package Tree;

public class Solution_b {
    /**
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
     * @param pRootOfTree
     * @return
     *
     * 二叉搜索树：又叫二叉排序树，若左边不为空，根节点的左边比根小，
     * 若右边不为空根节点的右边都比根大，他的子树也是这样（或者是一个空树）
     * 二叉搜索树中序遍历过后是排序的
     */
    public TreeNode prev = null;
    public void ConvertChild(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return ;
        }
        ConvertChild(pRootOfTree.left);
        pRootOfTree.left = prev;
        if (prev != null) {
            prev.right = pRootOfTree;
        }
        prev = pRootOfTree;
        ConvertChild(pRootOfTree.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        ConvertChild(pRootOfTree);
        TreeNode head = pRootOfTree;
        while (head != null && head.left != null) {
            head = head.left;
        }
        return head;
    }
}
