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