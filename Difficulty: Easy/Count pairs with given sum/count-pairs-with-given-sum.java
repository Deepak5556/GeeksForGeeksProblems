//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
     public static int countPairs(int[] arr, int target) {
        // int n = arr.length;
        // int count = 0;
        // HashSet<Integer> hs = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        //     int diff = target - arr[i];
        //     if (hs.contains(diff)) {
        //         count++;
        //     } else {
        //         hs.add(arr[i]);
        //     }
        // }
        // return count;
        int n=arr.length;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
         for (int i = 0; i < n; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                count += map.get(diff);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return count;
        // int n=arr.length;
        // int count =0 ;
        // if(n==0)return 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]+arr[j]==target){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}

//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.countPairs(nums, target));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends