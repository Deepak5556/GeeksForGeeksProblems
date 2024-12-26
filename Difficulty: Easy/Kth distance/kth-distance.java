//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i;j<=k;j++)
        //     {
        //         if(arr[j]!=arr[j+1])return false;
        //     }
        // }
        // return true;
        HashSet <Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
             if (!hs.add(arr[i])) {
                return true;
            } 
            if (hs.size() > k) {
                hs.remove(arr[i - k]);
            }
        }
        return false;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }
            int k = Integer.parseInt(br.readLine());
            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            boolean res = obj.checkDuplicatesWithinK(arr, k);
            if (res)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends