import java.util.*;

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
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                curr.next = list2;
                list2 = list2.next;

            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return head.next;
    }
}

public class Main {

    public static void main(String[] args) {
        int [] listA={0,1,2,3};
        int [] listB={4,5,6,7};

       ListNode list1=buildList(listA);
       ListNode list2=buildList(listB);

       ListNode sol=Solution.mergeTwoLists(list1, list2);
        
       String Solution="";
        while(sol!=null){
            Solution+=sol.val+"->";
            sol=sol.next;
        }
        Solution=Solution.substring(0,Solution.length()-2);
        System.out.println(Solution);
        
    }

    static ListNode buildList(int[] list) {
        if (list.length == 0)
            return null;

        ListNode head = new ListNode(list[0]);
        ListNode curr = head;

        for (int i = 1; i < list.length; i++) {
            curr.next = new ListNode(list[i]);
            curr = curr.next;
        }

        return head;
    }

}