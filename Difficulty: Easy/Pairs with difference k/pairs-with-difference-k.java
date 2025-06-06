//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
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

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.countPairsWithDiffK(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        // int count=0;
        // if(arr.length==0)return 0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(Math.abs(arr[i]-arr[j])==k)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i]+k)){
                ans += hm.get(arr[i]+k);
            }
            if(hm.containsKey(arr[i]-k)){
                ans += hm.get(arr[i]-k);
            }
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        return ans;   
    }
}