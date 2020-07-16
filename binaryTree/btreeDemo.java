package com.std;

public class btreeDemo {

    public static void main(String []args){

        BinaryTree btree = new BinaryTree();
        btree.add(10);
        btree.add(15);
        btree.add(5);
        btree.add(8);
        btree.add(20);

        btree.preorder();

    }

}
