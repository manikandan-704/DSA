package LinkedList;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        
        //LinkedList = stores nodes in 2 parts (data + address)
        //             Node are in non-consecutive memory locations
        //             Elements are linked using pointers
        
        //singly Linkedlist = [data | next node address] ==>Node
        //doubly Linkledlist = [previous node address |data | next node address] ==>Node

        //Can implement Stacks & Queues
        //Inserting/Deleting will be easy --> O(1)
        //Seraching/Accessing --> O(n)

        LinkedList<String>ListName= new LinkedList<>();

        //Queue implementation

        ListName.offer("a");
        ListName.offer("b");
        ListName.offer("c"); 

        ListName.poll();   //remove the first element => dequeue

        //Stack implementation

        ListName.push("A");
        ListName.push("B");  // last in

        ListName.pop();  // remove the last in 

        //Linedlist implementation

        ListName.add(3,"D");
        ListName.removeLast();
        ListName.removeFirst();
        ListName.addLast("d");
        ListName.addFirst("a");

        System.out.println(ListName.peekFirst());
        System.out.println(ListName.peekLast());

        
        System.out.println(ListName);


    }
}
