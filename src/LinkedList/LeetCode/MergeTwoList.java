package LinkedList.LeetCode;

public class MergeTwoList {
    static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(5);
        l1.next.next.next.next=new ListNode(7);
        l1.next.next.next.next.next=new ListNode(9);
//        l1.printList(l1);
//        System.out.println();
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(2);
        l2.next.next=new ListNode(3);
        l2.next.next.next=new ListNode(6);
        l2.next.next.next.next=new ListNode(8);
//        l2.printList(l2);
        ListNode result=merge(l1,l2);
        result.printList(result);

    }
    static ListNode merge(ListNode l1, ListNode l2){
        ListNode cur=new ListNode(0);
        ListNode temp =cur;
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1 != null){
            temp.next=l1;
        }
        if(l2 != null){
            temp.next=l2;
        }
        return cur;
    }

}
