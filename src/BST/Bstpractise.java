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
    //Empty or Not
    public boolean isEmpty(){
        return root==null;
    }

    //Insertion Into BST
    public void insert(int element){
        //the final return is root
        root = insert(element,root);
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


    //checking isBalanced
    public boolean isBalanced(){
        return balanced_helper(root);
    }
    public boolean balanced_helper(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1  &&  balanced_helper(node.left) && balanced_helper(node.right);
    }


    //displaying the tree
    public void display(){
        display_helper("Root Node: ",root);
    }
    public void display_helper(String details, Node node){
        if(node==null){return;}
        System.out.println(details+node.val);
        display_helper("Left Child of "+node.val+" is: ",node.left);
        display_helper("Right Child of "+node.val+" is: ",node.right);

    }

    //inserting multiple node at a time
    public void populate(int[] arr){
        for (int i :arr){
            insert(i);
        }
    }

}