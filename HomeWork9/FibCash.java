package HomeWork9;

public class FibCash {
    int fib(int n) {
        return fib(n, new int[n + 1]);
    }

    int fib(int i, int[] memo) {
        if (i == 0 || i == 1)
            return i;
        if (memo[i] == 0) {
            memo[i] = fib(i - 1) + fib(i - 2);
        }
        return memo[i];

    }


}
