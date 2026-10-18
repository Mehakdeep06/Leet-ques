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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int size =0;
        while(temp != null){
            size++; temp = temp.next;
        }
        int arr[] = new int[size];
        temp = head;
        for(int i=0;i<size;i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for(int j=0;j<size;j++){
            res.next =  new ListNode(arr[j]);
            res  = res.next;
        }
        return dummy.next;
        
    }
}