import java.math.BigInteger;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String val1 = "", val2 = "";

        // Convert first linked list to string (reversed)
        while (l1 != null) {
            val1 = l1.val + val1;
            l1 = l1.next;
        }

        // Convert second linked list to string (reversed)
        while (l2 != null) {
            val2 = l2.val + val2;
            l2 = l2.next;
        }

        // Convert strings to BigInteger and add
        BigInteger sum1 = new BigInteger(val1);
        BigInteger sum2 = new BigInteger(val2);
        BigInteger sum = sum1.add(sum2);

        // Convert sum to string and create linked list
        String nl = sum.toString();
        ListNode[] arr = new ListNode[nl.length()];
        for (int i = 0, x = nl.length() - 1; i < nl.length(); i++, x--) {
            arr[i] = new ListNode(nl.charAt(x) - '0');
        }

        // Link the nodes
        for (int i = 0; i + 1 < arr.length; i++) {
            arr[i].next = arr[i + 1];
        }

        return arr[0];
    }
}

public class Main {
    public static void main(String[] args) {
        // Create first number: 243 (3 -> 4 -> 2)
        ListNode l1 = new ListNode(3);
        l1 = new ListNode(4, l1);
        l1 = new ListNode(2, l1);

        // Create second number: 564 (4 -> 6 -> 5)
        ListNode l2 = new ListNode(4);
        l2 = new ListNode(6, l2);
        l2 = new ListNode(5, l2);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result
        System.out.print("Sum: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
        System.out.println();
    }
}
