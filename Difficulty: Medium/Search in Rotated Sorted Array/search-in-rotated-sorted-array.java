// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}