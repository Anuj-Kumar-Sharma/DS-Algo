package binarySearchTree;

public class BinarySearchTree {

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

    public void preOrder(){
        printPreOrder(root);
    }
    public void postOrder(){
        printPostOrder(root);
    }
    public void inOrder(){
        printInOrder(root);
    }
    
    private void printPreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private void printInOrder(Node root){
        if(root == null){
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    private void printPostOrder(Node root){
        if(root == null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }

}
