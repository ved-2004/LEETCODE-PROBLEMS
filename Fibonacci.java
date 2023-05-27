public class Fibonacci {
    public int fib(int n) {
        int a = 0, b = 1;
        if(n==0)    return a;
        if(n==1)    return b;
        for(int i=0;i<=n-2;i++)
        {
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
