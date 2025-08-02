package BST;

public class BST {
    public class node{
        private int val;
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


}
