public class Fibonacci {

    public static int fib_recursive(int n) {
        if (n < 2)
            return n;
        else
            return fib_recursive(n - 1) + fib_recursive(n - 2);
    }

    public static int fib_dp(int n) {

        int[] fibnumbers = new int[n + 1];
        fibnumbers[0] = 0;
        fibnumbers[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            fibnumbers[i] = fibnumbers[i - 1] + fibnumbers[i - 2];
        }

        return fibnumbers[n];
    }

    public static int fib_dp_optimized(int n) {

        int fibfirst = 0;
        int fibsecond = 1;

        for (int i = 2; i < n + 1; i++) {
            fibsecond = fibfirst + fibsecond;
            fibfirst = fibsecond - fibfirst;
        }

        return fibsecond;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println("Fibonacci(40) with recursion = " + fib_recursive(40));
        long mid1 = System.currentTimeMillis();
        System.out.println("Fibonacci(40) with Dynamic programming = " + fib_dp(40));
        long mid2 = System.currentTimeMillis();
        System.out.println("Fibonacci(40) with DP optimized = " + fib_dp_optimized(40));
        long end = System.currentTimeMillis();

        System.out.println("Fib with recursion time = " + (mid1 - start) + " ms");
        System.out.println("Fib with DP time = " + (mid2 - mid1) + " ms");
        System.out.println("Fib with DP optimized time = " + (end - mid2) + " ms");

    }

}
