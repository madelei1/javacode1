package Review_mapAndset;

/**
 * 二叉搜索树
 */
public class BinarySearchTree {
      class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
   Node root = null;
    public  boolean search(int val) {
        Node cur = root;
        if (cur == null) {
            return false;
        }
        while (cur != null) {
            if (cur.val == val) {
                return true;
            }
            if (cur.val < val) {
                cur = cur.right;
            }
            if (cur.val > val) {
                cur = cur.left;
            }
        }
        return false;
    }
    public Node insert1(int val) {
        Node cur = root;
        Node node = new Node(val);
        while (cur != null) {
            if (cur.val > val) {
                if (cur.left != null) {
                    cur = cur.left;
                } else {
                    cur.left = node;
                }

            } else {
                if (cur.right != null) {
                    cur = cur.right;
                } else {
                    cur.right = node;
                }
            }
        }

        return root;
    }
    public boolean insert(int val) {
        Node node = new Node(val);
        Node cur = root;
        if (cur == null) {
            root = node;
            return true;
        }
        while (cur != null) {
            if (cur.val > val) {
                if(cur.left != null) {
                    cur = cur.left;
                } else {
                    cur.left = node;
                }
            } else if (cur.val == val) {
                return false;
            } else {
                if (cur.right != null) {
                    cur = cur.right;
                } else {
                    cur.right = node;
                }
            }
        }
        return true;
    }
    public void remove(int key) {
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if(cur.val == key) {
                removeNode(parent,cur);
                return;
            }else if(cur.val < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    /**
     *
     * @param parent 待删除节点的父亲节点
     * @param cur--待删除节点
     * @return
     */
    public void removeNode(Node parent,Node cur) {
        if (cur.left == null) {
             if (cur == root) {
                root = root.right;
             } else if (parent.left == cur) {
                 parent.left = cur.right;
             } else {
                 parent.right = cur.right;
             }
        } else if (cur.right == null) {
            if (cur == root) {
                root = root.left;
            } else if (parent.left == cur) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        } else {
            //当cur.left != null && cur.right != null
            //要么左边选最大的，要么又边选最小的--这样还可以保持这棵树是二叉搜索树。
            Node node = cur;
            Node node1 = cur.right;
            while (node1.right != null) {
                node = node1;
                node1 = node1.right;
            }
            cur.val = node1.val;
            if (node1 == node1.left) {
                node.left = node1.right;
            } else {
                node.right = node1.right;
            }

        }
    }
    public  void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public  void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }


}
