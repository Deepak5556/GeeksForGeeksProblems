class Solution {
    static boolean isPrime(int n) {
        boolean isPrime = true;
       if(n < 2)
       {
           return false;
       }
       for(int i = 2; i<= Math.sqrt(n);i++){
           if(n%i == 0)
           {
               isPrime = false;
               break;
           }
       }
       return isPrime;
    }
}