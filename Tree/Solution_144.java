package Tree;


import java.util.ArrayList;
import java.util.List;


public class Solution_144 {
    /**
     * 给定一个二叉树，返回它的 前序 遍历。
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        List<Integer> list1 = preorderTraversal(root.left);
        list.addAll(list1);
        List<Integer> list2 = preorderTraversal(root.right);
        list.addAll(list2);
        return list;
    }
}
