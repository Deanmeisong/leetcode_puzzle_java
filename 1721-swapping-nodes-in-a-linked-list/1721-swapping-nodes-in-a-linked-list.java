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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        while(--k > 0) {
            fast = fast.next;
        }
        ListNode p = fast;
        ListNode slow = head;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int tmp = p.val;
        p.val = slow.val;
        slow.val = tmp;
        return head;
    }
}