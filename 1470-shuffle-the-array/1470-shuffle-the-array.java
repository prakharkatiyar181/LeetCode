class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0,j=n,k=0;
        int [] ans = new int[2*n]; 
        for(i=0 ; i<n ; i++) {
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            k=k+2;
            j++;
        }
        return ans;
    }
}