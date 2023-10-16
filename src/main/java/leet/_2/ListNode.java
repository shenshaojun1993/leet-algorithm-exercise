package main.java.leet._2;

public class ListNode {
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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        // 将L2加到L1上，如果双方有一方较短，需要补0
        while (l1.next != null || l2.next != null) {
            if (l1.next == null) {
                l1.next = new ListNode(0, null);
            }
            if (l2.next == null) {
                l2.next = new ListNode(0, null);
            }

            if (l1.val + l2.val > 9) {
                // 后一位加一
                l1.val = (l1.val + l2.val) % 10;
                l1.next.val ++;
            } else {
                l1.val += l2.val;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        l1.val = (l1.val + l2.val) % 10;
        if (l1.val + l2.val > 9) {
            // 后一位加一

            l1.next = new ListNode(1);
        } else {
            l1.val += l2.val;
        }
        return result;
    }
}
