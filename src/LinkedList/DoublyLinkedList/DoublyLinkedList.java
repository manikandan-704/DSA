package LinkedList.DoublyLinkedList;


public class DoublyLinkedList {
    private Node head;

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node= new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void Display(){
        Node node=head;
        Node last=null;
        while(node != null){
            System.out.print(node.val+" -> ");
            last=node;
            node=node.next;
        }
        System.out.println();

        System.out.println("Reversed DoublyLinkedList");
        while (last != null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }

        last.next=node;
        node.prev=last;
    }

    public Node findVal(int val){
        Node check=head;
        while(check != null) {
            if (check.val == val) {
                return check;
            }
            check=check.next;
        }
        return null;
    }

    public void insertAfter(int afterVal,int val){
        Node p=findVal(afterVal);
        Node node=new Node(val);
        if(p == null){
            System.out.println("Value Not Exists");
            return;
        }
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next != null) {
            node.next.prev = node;
        }

    }


}

