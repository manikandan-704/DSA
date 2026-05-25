package LinkedList.LeetCode;

public class RemoveDup {
    static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(3);
        remove(head);
        head.printList(head);

    }
     static void remove(ListNode head){
        ListNode temp=head;
        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }
}
