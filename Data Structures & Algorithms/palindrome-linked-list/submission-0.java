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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        ListNode next=null;
        ListNode entry=head;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        while(slow!=null){
            next=slow.next;
            slow.next=temp;
            temp=slow;
            slow=next;
        }
        while(temp!=null){
            if(entry.val!=temp.val){
                return false;
            }
            entry=entry.next;
            temp=temp.next;
        }
        return true;
    }
}