package com.std;

public class BinaryTree {

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    Node root;

    public void add(int data){
        Node node = new Node(data);
        root = insert(root, node);
    }

    private Node insert(Node root,Node node){

        if (root == null){
            root = node;
        }
        else {

            if (node.data < root.data){
                root.left = insert(root.left,node);
            }
            else {
                root.right = insert(root.right, node);
            }
        }
        return root;
    }

    public void preorder(){
        printPreorder(root);
    }

    private void printPreorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }
}
