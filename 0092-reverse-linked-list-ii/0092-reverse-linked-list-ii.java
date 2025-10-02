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
        ListNode Leftprev=dummy;
        int i=1;
        while(i<left){
            Leftprev=Leftprev.next;
            i++;
        }
        i=0;
        ListNode curr=Leftprev.next;
        ListNode prev=null;
        while(i<right-left+1){
             ListNode tempnext=curr.next;
             curr.next=prev;
             prev=curr;
             curr=tempnext;
            i++;
        }
        Leftprev.next.next=curr;
        Leftprev.next=prev;
        return dummy.next;
    }
}