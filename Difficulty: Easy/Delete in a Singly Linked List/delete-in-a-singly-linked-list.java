/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(x==1){
           return head.next;
        }
        
        Node cur = head;
        int n = 1;
        while(cur != null && n < x-1)
        {
            cur = cur.next;
            n++;
        }
        if(cur != null && cur.next !=null)
        {
            cur.next=cur.next.next;
        }
        return head;
    }
}