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
    public int pairSum(ListNode head) {
        int n=0;
        ListNode fast=head;
        ListNode temp=head;
        int maxsum=0;
        while(fast!=null){
            n++;
            fast=fast.next;
        }
        int i=0;
        while(temp!=null){
            int sum=0;
            int num2=n-1-i;
            ListNode temp2=head;
            for(int j=0;j<num2;j++){
                temp2=temp2.next;
            }
            sum=temp.val+temp2.val;
            maxsum=Math.max(maxsum,sum);
            i++;
            temp=temp.next;
        }
        return maxsum;
    }
}