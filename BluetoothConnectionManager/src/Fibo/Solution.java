package Fibo;

public class Solution {

    static int MAXVALUE = 92;
    static long[] c = new long[MAXVALUE];

    public static void main(String[] args) {
//        long start = new Date().getTime();
//        for (int i = 0; i < MAXVALUE; i++) {
//            System.out.println( i + " : " + Solution.fibo(i));
//            Solution.fibo(i);
//        }
//        System.out.println(new Date().getTime() - start);
        System.out.println(Solution.pow(2, 10));
    }


    private static long fibo(int i){
        if (i == 0) return 0;
        if (i == 1) return 1;
        if (c[i] > 0) return c[i];
        return c[i] = fibo(i - 1) + fibo(i - 2);
    }

    private static long pow(long x, int n){
        if (n == 0) return 1;
        if (n%2 != 0) return pow(x, n-1) * x;
        long y = pow(x, n/2);
        return y*y;
    }
}
