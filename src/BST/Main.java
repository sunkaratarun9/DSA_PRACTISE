package BST;
import BST.Bstpractise.*;
public class Main  {
    public static void main(String[] args) {
        Bstpractise tree=new Bstpractise();
//        System.out.println("isEmpty: "+tree.isEmpty());
//        tree.insert(15);
//        tree.insert(10);
//        tree.insert(5);
//        tree.insert(8);
//        tree.insert(12);
//        tree.insert(20);
//        System.out.println("isEmpty: "+tree.isEmpty());
//        System.out.println("isBalanced: "+tree.isBalanced());
//        tree.insert(17);
//        System.out.println("isBalanced: "+tree.isBalanced());
        int[] arr={15,10,5,8,12,20,17};
        tree.populate(arr);
        tree.display();


    }
}
