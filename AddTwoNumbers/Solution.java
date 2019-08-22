/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode n1 = l1 ,n2 = l2, n3 = head;
        
        while(n1!=null || n2!= null){
            if(n1!=null){
                carry += n1.val;
                n1 = n1.next;
            }

            if(n2!=null){
                carry += n2.val;
                n2 = n2.next;
            }
            
            n3.next = new ListNode(carry % 10);
            n3 = n3.next;
            carry /= 10;
        }
        if(carry==1)
            n3.next = new ListNode(1);
        
        return head.next;
    }
}
