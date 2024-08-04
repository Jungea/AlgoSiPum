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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

    public BigInteger toBigInt(ListNode node) {
        String val = "";
        while (node != null) {
            val += node.val;
            node = node.next;
        }
        return new BigInteger(val);
    }

    public ListNode toReversedLinkedList(BigInteger val) {
        ListNode prev = null, node = null;
        for (char c : String.valueOf(val).toCharArray()) {
            node = new ListNode(Character.getNumericValue(c));
            node.next = prev;
            prev = node;
        }
        return node;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Reversed = reverseList(l1);
        ListNode l2Reversed = reverseList(l2);

        BigInteger result = toBigInt(l1Reversed).add(toBigInt(l2Reversed));
        return toReversedLinkedList(result);
    }
}