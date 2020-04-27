package Review_tree;

import java.util.ArrayList;
import java.util.List;

public class Solution_144 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
  }
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null) {
                return list;
            }
            list.add(root.val);
            List<Integer> list1 = preorderTraversal(root.left);
            //尾插list1中元素到list中
            list.addAll(list1);
            List<Integer> list2 = preorderTraversal(root.right);
            list.addAll(list2);
            return list;
        }

}
