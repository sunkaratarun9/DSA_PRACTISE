package LinkedList.DoublyLL;

public class Main {
    public static void main(String args[]){
//        System.out.println("Check");
        DLL list= new DLL();
        list.insertAtFirst(12);
        list.insertAtFirst(20);
        list.insertAtFirst(10);

        list.insertAtLast(100);

        list.display();

        list.display_reverse();

        list.insertAfter(50,200);

        list.insertAfter(98,10);
        list.display();
        list.insertAfter(30,20);
        list.display();
        list.insertAfter(99,100);
        list.display();
        list.insertAfter(116,99);
        list.display();
    }
}
