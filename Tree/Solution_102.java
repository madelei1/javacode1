package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_102 {
    /**
     * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
     * @param root
     * @return
     * 思路：题目要求返回List中嵌套list可以看成二维数组，每一个层数为一个list1，所以层数放入list中，
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list1 = new ArrayList<>();
            while (size > 0) {
                TreeNode x = queue.poll();
                size --;
                if (x != null) {
                    list1.add(x.val);
                    if (x.left != null) {
                        queue.offer(x.left);
                    }
                    if (x.right != null) {
                        queue.offer(x.right);
                    }
                }
            }
            list.add(list1);
        }
        return list;

    }
}
