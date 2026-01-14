import java.util.Arrays;

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

class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] list = { 1, 1, 2 };
        ListNode head=buildList(list);
        head=Solution.deleteDuplicates(head);
        String sol="";

        while(head !=null){
            sol+=head.val+"->";
            head=head.next;
        }

        sol=sol.substring(0,sol.length()-2);
        System.out.println("Original: "+Arrays.toString(list)+"\nSolution: "+sol);
    }

    static ListNode buildList(int[] list){
        if(list.length == 0)return null;

        ListNode head=new ListNode(list[0]);
        ListNode curr= head;

        for(int i=1;i<list.length;i++){
            curr.next=new ListNode(list[i]);
            curr=curr.next;
        }

        return head;
    }
}