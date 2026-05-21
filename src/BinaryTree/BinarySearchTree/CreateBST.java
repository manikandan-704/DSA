package BinaryTree.BinarySearchTree;

public class CreateBST {
    static void main(String[] args) {

        BasicSearchTree bst = new BasicSearchTree(50);

        bst.Insert(bst.root,40);
        bst.Insert(60);
        bst.Insert(70);
        bst.Insert(30);
        bst.Insert(20);
        bst.inOrder(bst.root);
    }
}
