package BinaryTree.BinarySearchTree;

public class BasicSearchTree {

    Node root;

    public static class Node {
        int key;
        Node left, right;

        Node(int val) {
            key = val;
            left = right = null;
        }
    }

    BasicSearchTree() {
        root = null;
    }

    BasicSearchTree(int val) {
        root = new Node(val);
    }

    public void Insert(int val){
        Insert(root,val);
    }
    public Node Insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (root.key > val)
            root.left = Insert(root.left, val);

        else
            root.right=Insert(root.right,val);

        return root;
    }


    public void inOrder(Node root){
        inOrder(root.left);
        System.out.println(root.key+" ");
        inOrder(root.right);
    }
}
