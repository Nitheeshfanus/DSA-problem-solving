class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Stack<Node> stack = new Stack<>();
        Node dummy = new Node();
        dummy.val = 0;
        dummy.next = head;
        Node prev = dummy;
        stack.push(head);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;
            if (curr.next != null) {
                stack.push(curr.next);
            }
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }
        dummy.next.prev = null;
        return dummy.next;
    }
}
