package BST;

public class Bstpractise {
    public static class Node{
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
    public Bstpractise(){

    }
    public int height(Node node){
        if(node==null)
            return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int element){
        root =insert(element,root);
    }
    public Node insert (int element,Node node){
        if(node==null) {
            node = new Node(element);
            return node;
        }
        if(element < node.val){
            node.left=insert(element,node.left);

        }
        if(element > node.val){
            node.right=insert(element,node.right);
        }
        node.height= Math.max(height(node.left),height(node.right))+1;;
        return node;
    }
}