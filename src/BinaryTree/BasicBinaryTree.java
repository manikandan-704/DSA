package BinaryTree;

public class BasicBinaryTree {

    Node root;
     public static class Node{
        char value;
        Node left;
        Node right;

        // Node Constructor
        Node(char val){
            value=val;
            left=null;
            right=null;
        }
    }

    // Create new Root Node
    public BasicBinaryTree(char val) {
        root = new Node(val);
    }

    // Insert the new node at the left of Root Node
    public void InsertLeft(Node preNode, char val){
        Node newNode= new Node(val);
        preNode.left=newNode;
    }

    // Insert the new node at the right of Root Node
    public void InsertRight(Node preNode, char val){
        preNode.right= new Node(val);
    }

    public static void PreOrderDisplay(Node root){
         if(root != null) {
             System.out.print(root.value + " ");
             PreOrderDisplay(root.left);
             PreOrderDisplay(root.right);
         }
    }

    public static void InOrderDisplay(Node root){
        if(root != null) {
            InOrderDisplay(root.left);
            System.out.print(root.value + " ");
            InOrderDisplay(root.right);
        }
    }
    public static void PostOrderDisplay(Node root){
        if(root != null) {
            PostOrderDisplay(root.left);
            PostOrderDisplay(root.right);
            System.out.print(root.value + " ");
        }
    }
}
