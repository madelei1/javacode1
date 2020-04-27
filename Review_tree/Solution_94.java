package Review_tree;

import java.util.ArrayList;
import java.util.List;

public class Solution_94 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null) {
                return list;
            }
            List<Integer> node = inorderTraversal(root.left);
            list.addAll(node);
            list.add(root.val);
            List<Integer> list1 = inorderTraversal(root.right);
            list.addAll(list1);
            return list;
        }

}
