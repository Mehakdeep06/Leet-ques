class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        
        if (head == null || head.next == null) {
            return head;
        }
        int size =1;
        while(tail.next!=null){
            size++; tail = tail.next;
        }
        
        if(k%size == 0 || k==0) return head;
       
        
            k = k%size;
        tail.next = head;
        
        int last = size-k; 
        ListNode node = head;

        for(int i=1;i<last;i++){
            node = node.next;
        }
        ListNode newH = node.next;
        node.next = null;

        return newH;

        
    }
}