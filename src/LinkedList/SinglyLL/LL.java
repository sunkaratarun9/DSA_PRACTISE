package LinkedList.SinglyLL;


public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +"->");
            temp=temp.next;
        }
        System.out.println("end");

    }

    public void insertAtFirst(int val){
        if (tail==null){
            tail=head;
        }
        Node node = new Node(val);
        node.next=head;
        head=node;
        size++;
    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        if (tail==null){
            insertAtFirst(val);
        }
        size++;
    }

    public void insertAtPOS(int val,int index){
        if (index>size || index < 0){
            return;
        }
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if (index==size){
            insertAtLast(val);
            return;
        }
        Node temp= head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteAtFirst(){
        int val= head.val;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node =head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public int deleteAtLast(){
        if (size<=1){
            deleteAtFirst();
        }
        Node secondlast= get(size-2);
        int val = tail.val;;
        tail=secondlast;
        tail.next=null;
        return val;
    }

    public int deleteAtPOS(int index){
        if (index==0){
            return deleteAtFirst();
        }
        if(index==size-1){
            return deleteAtLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next=prev.next.next;

        return val;
    }

    public int search(int val){
        int index=0;
        Node node =head;
        while(node!=null){
            if (node.val==val){
                return index;
            }
            index++;
            node=node.next;
        }
//        return node;
        return -1;
    }


    private class Node{
        private int val;
        private Node next;

//        constructor
        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


}
