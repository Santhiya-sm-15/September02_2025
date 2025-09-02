# September02_2025
The problem that I solved today

Given the head of a singly linked list and an integer k. Swap the kth node (1-based index) from the beginning and the kth node from the end of the linked list. Return the head of the final formed list and if it's not possible to swap the nodes return the original list.

Code:
class Solution {
    public Node swapKth(Node head, int k) {
        List<Node> l=new ArrayList<>();
        Node t=head;
        while(t!=null)
        {
            l.add(t);
            t=t.next;
        }
        int n=l.size();
        if(n<k)
            return head;
        int x=l.get(k-1).data;
        l.get(k-1).data=l.get(n-k).data;
        l.get(n-k).data=x;
        return head;
    }
}
