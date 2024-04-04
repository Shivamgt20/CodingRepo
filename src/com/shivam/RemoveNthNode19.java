package com.shivam;

public class RemoveNthNode19 {
    public static void main(String[] args) {

        
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            head = null;
            return head;
        }

        ListNode p = head, q = head;
        int i = 0;

        while (p.next != null && i < n) {
            p = p.next;
            i++;
        }

        while (p.next != null) {
            p = p.next;
            q = q.next;
        }

        q = q.next.next;

        return head;
    }
}
