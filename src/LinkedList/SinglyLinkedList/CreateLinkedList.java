package LinkedList.SinglyLinkedList;

public class CreateLinkedList {
    private Node head;
    private Node tail;
    int size;

    public CreateLinkedList(){
        this.size=0;
    }

    public void size() {
        System.out.println(size);
    }

    private static class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    // Create new node and inserting the first element
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size+=1;
    }

    // insert the node at the last
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return ;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }


    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }


    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }


    public Node getIndex(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast=getIndex(size-2);
        int val=tail.val;
        tail=secondLast;
        tail.next=null;

        size--;
        return val;
    }

    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=getIndex(index-1);
        int val=prev.next.val;
        prev.next=prev.next.next;

        size--;
        return val;
    }

    public Node findValue(int val){
        Node node=head;
        while(node!=null){
            if(node.val == val){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    //Display the inserted elements
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

}
