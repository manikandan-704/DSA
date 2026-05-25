package LinkedList.LeetCode;

public class FindMid {
    static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        ListNode result=Middle(head);
        int result2=MiddleElement(head);
        head.printList(result);
        System.out.println();
        System.out.println("Middle Element of the Linked List: " +result2);
    }

    // Prints from the middle node
    static ListNode Middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //prints the middle element
    static int MiddleElement(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        assert slow != null;
        return slow.data;
    }
}
