/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode node : lists){
            ListNode temp = node;
            while(temp!=null){
                list.add(temp.val);
                temp = temp.next;
            }

        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for(Integer x : list){
            res.next = new ListNode(x);
            res = res.next;
        }
        return dummy.next;
    }
}