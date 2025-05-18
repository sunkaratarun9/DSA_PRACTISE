package LinkedList.SinglyLL;

public class Main {
    public static void main(String args[]){
        LL list = new LL();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);
        list.insertAtLast(99);
        list.insertAtPOS(60,5);
        list.insertAtPOS(70,-4);
        list.display();
        System.out.println("Removed : "+ list.deleteAtFirst());
        list.display();
        System.out.println("Removed : "+ list.deleteAtLast());
        list.display();
        System.out.println("Removed: "+ list.deleteAtPOS(2));
        list.display();
        System.out.println("30 Found at:"+list.search(30));
        list.display();

    }
}
