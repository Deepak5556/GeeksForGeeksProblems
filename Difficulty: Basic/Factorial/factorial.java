class Solution {
    static int factorial(int n) {
        return fact(n);
    }
    public static int fact(int n){
        if(n!=0)
           return n * fact(n-1);
        return 1;
    }
}