class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode leftPrev = dummy;

     
        for (int i = 0; i < left - 1; i++) {
            leftPrev = leftPrev.next;
        }

        ListNode leftNode = leftPrev.next;  
        ListNode curr = leftNode;
        ListNode prev = null;
         for (int i = 0; i <= right - left; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        leftPrev.next = prev;
        leftNode.next = curr;

        return dummy.next;
    }
}