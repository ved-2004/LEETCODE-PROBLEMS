public class ReverseInteger {
    public int reverse(int x) {
        boolean pos = x>=0 ? true : false;
        x = Math.abs(x+0);
        long sum = 0;
        while(x>0)
        {
            sum = sum*10 + (x%10);
            x = x/10;
        }
        if(sum>2147483647)
            return 0;
        return pos ? (int)sum : (int)sum*-1;
    }
}
