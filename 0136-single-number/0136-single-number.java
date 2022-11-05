class Solution {
    public int singleNumber(int[] nums) {
        int uniqueNumber=0;
        for(int i=0;i<nums.length;i++)
        {
            uniqueNumber= nums[i]^uniqueNumber;
        }
        return uniqueNumber;
    }
}