package zhonghcc.P0002_AddTwoNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p,q;
        p = l1;
        q = l2;
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        int remain=0;
        while (p!=null || q!=null){
            int pval = (p==null)?0:p.val;
            int qval = (q==null)?0:q.val;

            int v = pval + qval +remain;
            if(v>=10){
                remain = 1;//v/10;
                v = v % 10;
            }else{
                remain = 0;
            }
            ListNode node = new ListNode(v);
            temp.next = node;
            temp = node;
            if(p!=null) {
                p = p.next;
            }
            if(q!=null) {
                q = q.next;
            }
        }
        if(remain>0){
            ListNode node = new ListNode(remain);
            temp.next = node;

        }

        return head.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}