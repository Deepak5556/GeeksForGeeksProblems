//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String S = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static int maxLength(String s) {
        // code here
        Stack <Integer> st  = new Stack<>();
        st.push(-1);
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    count  = Math.max(count,i-st.peek());
                }
                else{
                    st.push(i);
                }
            }
        }
        return count;
    }
}