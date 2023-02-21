/*
Palindrome LinkedList
approach: as we know in a palindrome, start to mid and mid to end are same, so, reverse the list from mid to end and
check with start to mid.
time: O(n)
space: O(1)
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Problem1 {

    static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode p1 = head;
        ListNode p2 = reverseList(slow.next);

        while(p2!=null) {
            if(p1.val!=p2.val) return false;
            p2 = p2.next;
            p1 = p1.next;
        }

        return true;
    }

    static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head, fast = head.next, prev = null;

        while(fast!=null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;

        return curr;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
//        ListNode node5 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        node4.next = node5;
        System.out.println(isPalindrome(node1));
    }
}
