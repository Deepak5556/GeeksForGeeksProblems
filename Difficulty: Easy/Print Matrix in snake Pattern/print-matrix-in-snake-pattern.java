// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> al = new ArrayList<>();
        int n =  matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    al.add(matrix[i][j]);
                }
            }
            else{
                for(int k=n-1;k>=0;k--)
                {
                    al.add(matrix[i][k]);
                }
            }
        }
        return al;
    }
}