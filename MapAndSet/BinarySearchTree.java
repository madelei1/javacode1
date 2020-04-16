package MapAndSet;

public class BinarySearchTree {
    /**
     * 搜索树：
     * 二叉搜索树又称二叉排序树，它或者是一棵空树**，或者是具有以下性质的二叉树:
     * 若它的左子树不为空，则左子树上所有节点的值都小于根节点的值
     * 若它的右子树不为空，则右子树上所有节点的值都大于根节点的值
     * 它的左右子树也分别为二叉搜索树
     *
     */
    class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }
    public Node root = null;

    /**
     * 在搜索树中查找 key，如果找到，返回 key 所在的结点
     * @param key
     * @return
     */
    public Node search(int key) {
        Node cur = root;
        while (cur != null) {
            if (cur.key > key ) {
                cur = cur.left;
            } else if (cur.key < key) {
                cur = cur.right;
            } else {
                return cur;
            }
        }
        return null;
    }

    /**
     * 插入成功返回 true，失败返回 false
     * @param key
     * @return //唯一插入失败的就是出现相同的值
     */
    public boolean insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null; // 记录当前cur的父亲节点
        //此while循环是为了将cur指向末尾，root的二边一个大一个小，
        // 当cur向下移动的时候，新的root也是这样
        while (cur != null) {
            if (cur.key == key) {
                return false;
            }
            if (cur.key > key) {
                parent = cur;
                cur = cur.left;
            } else if (cur.key < key) {
                parent = cur;
                cur = cur.right;
            }
        }
        //当指向后面，查看key和root的值的大小关系--判断插入的位置
        if (parent.key > key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;

    }
    /**
     * 删除成功返回 true，失败返回 false
     * 设待删除结点为 cur, 待删除结点的双亲结点为 parent
     * 1. cur.left == null
     * 1. cur 是 root，则 root = cur.right
     * 2. cur 不是 root，cur 是 parent.left，则 parent.left = cur.right
     * 3. cur 不是 root，cur 是 parent.right，则 parent.right = cur.right
     *
     * 2. cur.right == null
     * 1. cur 是 root，则 root = cur.left
     * 2. cur 不是 root，cur 是 parent.left，则 parent.left = cur.left
     * 3. cur 不是 root，cur 是 parent.right，则 parent.right = cur.left
     *
     * 3. cur.left != null && cur.right != null
     * @param key
     * @return
     */
    public boolean remove(int key) {
        Node cur = root;
        Node parent = null;

        while (cur != null) {
            if (root.key == key) {
                if (root.right == null && root.left == null) {
                    root = null;
                    return true;
                } else if (root.right == null) {
                    root = root.left;
                    return true;
                } else {
                    parent = root;
                    root = root.right;
                    root.left = parent.left;
                }
                root = cur.right;
                return true;
            }
            if (cur.key == key) {
                if (cur.left == null) {
                    parent.right = cur.right;
                    return true;

                } else if (cur.right == null) {
                    parent.left =cur.left;
                    return true;

                } else {
                    if (parent.key < key) {
                        parent.right = cur.right;
                        parent.right.left = cur.left;
                        return true;
                    } else {
                        parent.left = cur.left;
                        parent.left.right = cur.right;
                        return true;
                    }
                }
            } else {
                if (cur.key > key) {
                    parent =cur;
                    cur = cur.left;
                } else {
                    parent = cur;
                    cur = cur.right;
                }
            }
        }
        return false;

    }
    public static void preOrder(BinarySearchTree.Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.key+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(BinarySearchTree.Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.key+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int[] array = {5,3,4,1,7,8,2,6,0,9};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int val : array) {
            binarySearchTree.insert(val);
        }
        binarySearchTree.insert(5);
        preOrder(binarySearchTree.root);//5 3 1 0 2 4 7 6 8 9
        System.out.println();

        inOrder(binarySearchTree.root);//0 1 2 3 4 5 6 7 8 9
        System.out.println();

        System.out.println(binarySearchTree.search(7).key);//7
        binarySearchTree.remove(7);

        preOrder(binarySearchTree.root);//5 3 1 0 2 4 8 6 9
        System.out.println();
        inOrder(binarySearchTree.root);//0 1 2 3 4 5 6 8 9
        System.out.println();
    }

}
