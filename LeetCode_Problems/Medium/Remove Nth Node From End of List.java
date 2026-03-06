class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(n==count)
        {
            return head.next;
        }
        temp=head;
        int i=0;
        while(i<(count-n-1))
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}