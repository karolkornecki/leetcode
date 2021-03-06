package pl.ksolutions.leetcode.algorithms.adt;

/**
 * @author Karol Kornecki
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int x, ListNode n) {
        val = x;
        next = n;
    }

    @Override
    public String toString() {
        if (next == null) {
            return "" + val;
        }
        return val + next.toString();
    }
}
