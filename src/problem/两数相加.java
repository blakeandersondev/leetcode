package problem;

public class 两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int var1 = l1 == null ? 0 : l1.val;
            int var2 = l2 == null ? 0 : l2.val;

            int sum = var1 + var2 + carry;

            carry = sum / 10;
            sum = sum % 10;
            current.next = new ListNode(sum);

            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry == 1) {
            current.next = new ListNode(1);
        }

        return head.next;
    }

    class ListNode {
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
}



