package HomeWork9;

public class FibFor {
    int fib(int n) {
        if (n == 0 || n == 1)
            return 1;
        int mas[] = new int[n];
        mas[0]=0;
        mas[1]=1;
        for (int i = 2; i < n; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }

        return mas[n - 1] + mas[n - 2];

    }
}
