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
    public ListNode modifiedList(int[] nums, ListNode head) {
         HashSet<Integer> s = new HashSet<>();
        for(int i : nums) s.add(i);
        ListNode p = head,prev = null;
        int f = 0;
        while(p != null){
            while(p != null && s.contains(p.val)){
                if(p.next != null){
                    p.val = p.next.val;
                    p.next = p.next.next;
                }
                else{
                    System.out.println(p.val);
                    prev.next = null;
                    p = null;
                }
            }
            if(p != null) {
                prev = p;
                p = p.next;
            }
        }
        return head;
    }
}