// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteHead(Node head) {
    //   Node temp = head;
       head = head.next;
       return head;
    }
}