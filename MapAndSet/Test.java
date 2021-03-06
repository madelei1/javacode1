package MapAndSet;


class BinarySearchTree {

    static class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public Node root = null;

    public Node search(int val) {
        Node cur = root;
        while (cur != null) {
            if (cur.data > val) {
                cur = cur.left;
            } else if (cur.data < val) {
                cur = cur.right;
            } else {
                return cur;
            }
        }
        return null;
    }
    public boolean insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return true;
        }
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if (cur.data == key) {
                return false;
            }
            if (cur.data > key) {
                parent = cur;
                cur = cur.left;
            } else if (cur.data < key) {
                parent = cur;
                cur = cur.right;
            }
        }
        if (parent.data < node.data) {
            parent.right = node;
        } else if (parent.data > node.data){
            parent.left = node;
        }
        return true;

    }

    public void remove(int key) {
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if(cur.data == key) {
                removeNode(parent,cur);
                return;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }
    private void removeNode(Node parent,Node cur) {
        if(cur.left == null) {
            //3种情况
            if (cur == root) {
                root = cur.right;
            } else {
                if (cur == parent.left) {
                    parent.left = cur.right;
                } else {
                    parent.right = cur.right;
                }
            }

        }else if(cur.right == null) {
            //3种情况
            if (cur == root) {
                root = cur.left;
            } else {
                if (cur == parent.left) {
                    parent.left = cur.left;
                } else {
                    parent.right = cur.left;
                }
            }

        }else {

        }
    }

}


