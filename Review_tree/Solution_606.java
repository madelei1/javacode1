package Review_tree;

public class Solution_606 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
     *
     * 空节点则用一对空括号 "()" 表示。
     * 而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/construct-string-from-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param t
     * @return
     */
    public String tree2str(TreeNode t) {
        StringBuffer sb = new StringBuffer();
        tree2strChild(t,sb);
        return sb.toString();

    }
    public void tree2strChild(TreeNode t,StringBuffer sb) {
        if (t == null) {
            return ;
        }
        sb.append(t.val);
        if (t.left == null) {
            if (t.right == null) {
                return;
            } else {
                sb.append("()");
            }
        } else {
            sb.append("(");
            tree2strChild(t.left,sb);
            sb.append(")");
        }
        if (t.right == null) {
            return;
        } else {
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }
    }
}
