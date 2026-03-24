/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        head= reverse(head);
        Node temp= head;
        int carry =1;
     
        while(temp != null){
            
            int t= temp.data + carry;
            
            temp.data= (t) % 10;
            
            carry = t/10;
            
            if (carry == 0) break;
            
            if (temp.next == null && carry == 1) {
                temp.next = new Node(1);
                break;
            }
            
            temp= temp.next;
        }
        
       
        return reverse(head);
      
    }
    public Node reverse(Node head){
        
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
