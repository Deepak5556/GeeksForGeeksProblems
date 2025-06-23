// User function Template for Java
class Solution {
    //Prime
    public static boolean isPrime(int n ){
       if(n<=1)return false;
       for(int i=2;i*i<=n;i++){
           if(n%i==0)return false;
       }
       return true;
    }
    //reverse
    public static int reverse(int n){
         int rem =0;
        while(n>0){
            rem = (rem*10) + n%10;
            n = n/10;
        }
        return rem;
    }
    int isTwistedPrime(int N) {
        int M = reverse(N);
        if(isPrime(N)&&isPrime(M)){
            return 1;
        }
        return 0;
    }
}