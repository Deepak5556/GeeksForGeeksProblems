/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        int ans = 0;
        if(head == null)
        {
            return ans;
        }
        
        Node cur = head;
        while(cur != null){
            if(key == cur.data)
            {
                ans++;
                cur = cur.next;
            }
            else{
                cur = cur.next;
            }
        }
        return ans;
    }
}