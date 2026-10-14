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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++; temp = temp.next;
        }
        temp = head;
        int [] res = new int[size]; int j=0;
        for(int i=0;i<size;i++){
            ListNode pointer = temp.next;
            while(pointer!= null){
                if(temp.val < pointer.val){
                    res[j++] = pointer.val;
                    temp = temp.next;
                    break;
                }
                pointer = pointer.next;
                if(pointer == null){
                    res[j++] = 0;
                    temp = temp.next;
                }
            }

        }
        return res;
    }
}