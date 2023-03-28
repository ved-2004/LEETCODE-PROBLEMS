import java.util.ArrayList;

public class HappyNumber {
    int count(int n) {
        int sum=0;
        while(n>0)
        {
            sum += Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(true)
        {
            n = count(n);
            if(n==1)
                return true;
            else if (list.contains(n))
                return false;
            else
                list.add(n);
        }
    }
}
