package LinkedList.SinglyLinkedList;

public class Main {
     public static void main(String[] args) {
         CreateLinkedList list=new CreateLinkedList();
         list.insertFirst(3);
         list.insertFirst(4);
         list.insertFirst(22);
         list.insertFirst(33);
         list.insertFirst(56);

         list.insertLast(72);

         list.insert(34,3);
         list.Display();

         System.out.println(list.findValue(34));

         System.out.println(list.deleteFirst());
         list.Display();

         System.out.println(list.deleteLast());
         list.Display();

         System.out.println(list.deleteIndex(2));
         list.Display();
         list.size();
    }
}
