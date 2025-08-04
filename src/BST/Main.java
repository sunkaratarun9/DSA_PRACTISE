package BST;
import BST.Bstpractise.*;
public class Main  {
    public static void main(String[] args) {
        Bstpractise Bst=new Bstpractise();
        System.out.println("isEmpty: "+Bst.isEmpty());
        Bst.insert(15);
        Bst.insert(10);
        Bst.insert(5);
        Bst.insert(8);
        Bst.insert(12);
        Bst.insert(20);
        System.out.println("isEmpty: "+Bst.isEmpty());
        System.out.println("isBalanced: "+Bst.isBalanced());
        Bst.insert(17);
        System.out.println("isBalanced: "+Bst.isBalanced());


    }
}
