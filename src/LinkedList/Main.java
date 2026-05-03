package LinkedList;

public class Main {
     public static void main(String[] args) {
         CreateLinkedList list=new CreateLinkedList();
         list.insertFirst(3);
         list.insertFirst(4);
         list.insertFirst(22);
         list.insertFirst(33);
         list.insertFirst(56);

         list.Display();
         list.size();
    }
}
