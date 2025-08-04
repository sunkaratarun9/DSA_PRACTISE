package BST;

import org.w3c.dom.Node;

public class BST {
    public class Node{
        private final int val;
        private int height;
        private Node left;
        private Node right;
        public Node (int val){
            this.val=val;
        }
        public int getVal() {
            return val;
        }
    }
    private Node root;
    public BST(){

    }
    public int height(Node node){
        if(node==null)
            return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display("Root Node: ",root);
    }
    public void display(String details,Node node ){
        if(node==null) {
            System.out.println(details + "null");
            return;
        }
        else{
            System.out.println(details + node.getVal());
            display("Left Child Of " + node.getVal() + " : ", node.left);
            display("Right Child Of " + node.getVal() + " : ", node.right);
        }
    }




}
