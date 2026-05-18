package BinaryTree;

public class BasicMain {
    static void main(String[] args) {
        BasicBinaryTree tree=new BasicBinaryTree('A');
        tree.InsertLeft(tree.root,'B');
        tree.InsertRight(tree.root,'C');

        tree.InsertLeft(tree.root.left,'D');
        tree.InsertRight(tree.root.left,'E');

        tree.InsertLeft(tree.root.right,'F');
        tree.InsertRight(tree.root.right,'G');

        tree.InsertLeft(tree.root.left.right,'H');
        tree.InsertRight(tree.root.right.right,'I');

        BasicBinaryTree.PreOrderDisplay(tree.root);
        System.out.println();
        BasicBinaryTree.InOrderDisplay(tree.root);
        System.out.println();
        BasicBinaryTree.PostOrderDisplay(tree.root);
    }
}
