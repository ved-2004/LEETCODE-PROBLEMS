public class FirstBadVersion {

    //boolean isBadVersion(int version);
    public int Binary(int low, int high)
    {
        if(low==high-1)
            return high;
        int mid = low + (high-low)/2;
        if(isBadVersion(mid))
            return Binary(low,mid);
        else
            return Binary(mid,high);
    }
    public int firstBadVersion(int n) {
        return Binary(0,n);
    }
}
