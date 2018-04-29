package zhonghcc.P0002_AddTwoNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution_reverse {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int p = 0;
        int q = 0;
        ListNode pl1 = l1;
        ListNode pl2 = l2;

        ListNode work1 = l1;
        ListNode work2 = l2;
        while(pl1.next!=null){
            p++;
            pl1 = pl1.next;
        }
        while (pl2.next != null) {
            q++;
            pl2 = pl2.next;
        }
        if(p>q){
            work2 = fill(l2,p-q);
        }else{
            work1 = fill(l1,q-p);
        }

        ListNode ret = added(work1,work2);
        if(ret.val>=10){
            int v = ret.val;
            ret.val = v%10;
            ListNode fin = new ListNode(v/10);
            fin.next = ret;
            return fin;
        }
        return ret;


    }
    private ListNode fill(ListNode node,int length){
//        ListNode head ;
        int i=0;
        ListNode p = node;
        ListNode n = node;
        while(i<length){
            n = new ListNode(0);
            n.next = p;
            p = n;
            i++;
        }
        return n;
    }
    private ListNode added(ListNode l1,ListNode l2){
        //leaf
        if(l1.next==null && l2.next==null){
            return new ListNode(l1.val+l2.val);
        }else{
            ListNode child = added(l1.next,l2.next);
            int cur = 0;
            if(child.val>=10){
                int v = child.val;
                child.val = v%10;
                cur = v/10;
            }
            ListNode node = new ListNode(l1.val+l2.val+cur);
            node.next = child;
            return node;
        }
    }
}
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}