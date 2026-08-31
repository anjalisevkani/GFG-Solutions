class Solution {
    double power(double b, int e) {
        // code here
        long N=e;
        if(N<0){
            b=1/b;
            N=-N;
        }
        return pow(b,N);
    }
    double pow(double b,long n){
        if(n==0) return 1;
        double half=pow(b,n/2);
        if(n%2==0) return half*half;
        return b*half*half;
    }
}