class Solution {
    public int searchInsert(int[] nums, int target) {
        int x=0,curmax=Integer.MIN_VALUE;
        for(int a:nums)
        {
            if(a==target)
                return x;
            x++;
        }
        x=0;
        for(int a:nums)
        {
            if(a>=curmax&&a<target)
            {
                curmax=a;
                x++;
            }
        }
        return x;
    }
}