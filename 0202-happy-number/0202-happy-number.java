class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        while(n!=1) {
            if(!hs.contains(n))
                hs.add(n);
            else
                return false;
            int sum=0,x;
            while(n!=0) {
                x=n%10;
                sum = (x*x) + sum;
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
}