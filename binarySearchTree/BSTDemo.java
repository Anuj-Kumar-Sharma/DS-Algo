package binarySearchTree;

public class BSTDemo {

    public static void main(String []args){

        BinarySearchTree BSTree = new BinarySearchTree();
        BSTree.add(5);
        BSTree.add(4);
        BSTree.add(8);
        BSTree.add(3);
        BSTree.add(6);
        BSTree.add(7);

        BSTree.preOrder();
        System.out.println();
        BSTree.postOrder();
        System.out.println();
        BSTree.inOrder();

    }

}
