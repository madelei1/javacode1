package Review_tree;

import Tree.Node;


import java.util.Scanner;

public class Solution_Main {
    public static class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;
        TreeNode(char x) { val = x; }
    }
    /**
     * 编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。
     * 例如如下的先序遍历字符串： ABC##DE#G##F###
     * 其中“#”表示的是空格，空格字符代表空树。建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
     */
    static int i =0;
    public static TreeNode create(String s) {
        TreeNode node = null;
        if (s.charAt(i) != '#') {
            node = new TreeNode(s.charAt(i));
            i ++;
            node.left = create(s);
            node.right = create(s);
        } else {
            i ++;
        }
        return node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        TreeNode node = create(string);
        inOrderTraversal(node);
    }
    public static void inOrderTraversal(TreeNode root){
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+ " ");
        inOrderTraversal(root.right);

    }
}
