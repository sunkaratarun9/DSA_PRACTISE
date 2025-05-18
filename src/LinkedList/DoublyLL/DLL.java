package LinkedList.DoublyLL;

public class DLL {
    Node head;
    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head != null)
        {
            head.prev=node;
        }
        head=node;
    }
    public void insertAtLast(int val){

        Node node= new Node(val);
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
//        We need the last Node to insertAtLast
        Node last= head;
        while(last.next != null){
            last=last.next;
        }

        node.prev=last;
        last.next=node;
//        last=node;

    }

    public void insertAfter(int val,int After){
        Node prevnode=find(After);
        if (prevnode==null){
            System.out.println("AfterValue not exists !");
            return ;
        }
        Node node= new Node(val);//created node with val
        node.prev=prevnode;
        if (prevnode.next ==null){
            prevnode.next=node;
            node.next=null;
            return;
        }
        node.next=prevnode.next;
        prevnode.next.prev=node;
        prevnode.next=node;

    }
    public Node find(int val){
        Node node= head;
        while(node!=null){
            if (node.val==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insertAtindex(int val,int index){

    }

    public void display(){
        Node node=head;
        Node last=null;
        System.out.println();
        while(node != null){
            System.out.print(node.val+" -> ");
            last=node;
            node=node.next;
        }
        System.out.print("END");

//        System.out.println("\nPrint in Reverse Order");
//        while(last!=null){
//            System.out.print(last.val+" -> ");
//            last=last.prev;
//        }
//        System.out.print("START");
    }

    public void printReverse(Node temp){
        if (temp==null){
            System.out.print("\nSTART");

            return;
        }
        printReverse(temp.next);
        System.out.print(" -> "+temp.val);
    }
    public void display_reverse(){
        Node temp=head;
        printReverse(temp);
        System.out.print("\n");

    }




}
