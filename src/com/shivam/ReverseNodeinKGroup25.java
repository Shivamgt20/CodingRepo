package com.shivam;

import java.util.List;

public class ReverseNodeinKGroup25 {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode curr = head;
        curr.next = new ListNode(2);
        curr=curr.next;
        curr.next = new ListNode(3);
        curr=curr.next;
        curr.next = new ListNode(4);
        curr=curr.next;
        curr.next = new ListNode(5);
        curr=curr.next;
        curr.next = new ListNode(6);

        ListNode ans = reverseKGroup(head, 3);
        
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


    public static ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        int i = 1;
        ListNode revHead = null, revTail = null, prev = null;

        while (curr != null) {
            if (i == 1) {
                revHead = curr;
            }

            if (i == k) {

                revTail = curr;
                // call reverse function.
                 revTail = reverse(revHead, revTail, prev, curr.next); //revhead;
                 curr = revHead;
                if (prev == null) {
                    head = revTail;
                }else{
                    prev.next = revTail;
                }
                i = 0;
                prev = curr;
            }

            i++;
            curr = curr.next;
        }

        return head;
    }

    private static ListNode reverse(ListNode head, ListNode tail, ListNode prev, ListNode nn) {

        ListNode curr = head;
        ListNode prev1 = prev;

        while (curr != nn) {
            ListNode temp = curr.next;
            curr.next = prev1;
            prev1 = curr;
            curr = temp;
        }

        head.next = nn;//curr

        if (prev != null) {
            prev.next = head;
        }

        return prev1;
    }
}
