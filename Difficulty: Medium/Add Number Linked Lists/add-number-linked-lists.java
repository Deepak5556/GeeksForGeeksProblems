//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/
class Solution {
    public static Node reverse(Node node){
        Node temp=null;
        Node prev=null;
        Node curr=node;
        while(curr!=null)
        {
            temp=curr.next;
             curr.next=prev;
             prev=curr;
            curr=temp;
        }
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
       Node list1=reverse(num1);
       Node list2=reverse(num2);
       Node dummy=new Node(0);
       Node curr=dummy;
       int sum=0;
       while(list1!=null || list2!=null || sum!=0)
       {
           if(list1!=null)
           {
               sum+=list1.data;
               list1=list1.next;
               
           }
           if(list2!=null)
           {
               sum+=list2.data;
               list2=list2.next;
           }
           curr.next=new Node(sum%10);
           curr=curr.next;
            sum=sum/10;
       }
       dummy=dummy.next;
       Node val=reverse(dummy);
       if(val.data==0)
          return (val.next);
       return val;
    }
}

//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends