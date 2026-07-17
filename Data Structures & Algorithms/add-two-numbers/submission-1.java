class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();

        ListNode curr = dummy;

        ListNode p1 = l1;
        ListNode p2 = l2;
        int carried = 0;
        while(p1!=null && p2!=null) {
            int sum = p1.val + p2.val + carried;
            carried = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        while(p2 != null) {
            int sum = p2.val + carried;
            carried = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            p2 = p2.next;
        } 
        while(p1 != null) {
            int sum = p1.val + carried;
            carried = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            p1 = p1.next;
        } 
        while(carried!=0) {
            int sum = carried;
            carried = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
        }
        return dummy.next;
        
    }
}