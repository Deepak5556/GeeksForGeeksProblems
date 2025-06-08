class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 0; i<n;i++){
            int minindex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
}