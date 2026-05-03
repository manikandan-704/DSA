package LinkedList;

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

    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

}
