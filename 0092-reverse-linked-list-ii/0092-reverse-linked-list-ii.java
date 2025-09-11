/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        int i=1;
        while(i<left){
            prev=prev.next;
            i++;
        }
        i=0;
        ListNode curr=prev.next;
        ListNode frw=curr.next;
        while(i<right-left){
            curr.next=frw.next;
            frw.next=prev.next;
            prev.next=frw;
            frw=curr.next;
            i++;
        }
        return dummy.next;
    }
}