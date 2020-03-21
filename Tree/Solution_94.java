package Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution_94 {
    /**
     * 给定一个二叉树，返回它的中序 遍历。
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        List<Integer> list1 = inorderTraversal(root.left);
        list.addAll(list1);
        list.add(root.val);
        List<Integer> list2 = inorderTraversal(root.right);
        list.addAll(list2);
        return list;
    }
}
