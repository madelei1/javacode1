package Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        List<Integer> list1 = postorderTraversal(root.left);
        list.addAll(list1);
        List<Integer> list2 = postorderTraversal(root.right);
        list.addAll(list2);
        list.add(root.val);
        return list;

    }
}
