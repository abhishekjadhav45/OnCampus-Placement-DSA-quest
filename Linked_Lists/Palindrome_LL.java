// LeetCode 234 // 

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle node
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalfHead = reverseList(slow);
        ListNode copySecondHalf = secondHalfHead; // To restore later if needed

        // Step 3: Compare first half and reversed second half
        ListNode firstHalf = head;
        while (secondHalfHead != null) {
            if (firstHalf.val != secondHalfHead.val) {
                return false; // Not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalfHead = secondHalfHead.next;
        }

        // Optional Step 4: Restore original list if needed
        // reverseList(copySecondHalf);

        return true;
    }
private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
