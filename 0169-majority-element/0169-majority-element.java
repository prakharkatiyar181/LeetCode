class Solution {
    public int majorityElement(int[] nums) {
        int el = 0;
        int cnt = 0;
        int n = nums.length;
        int i = 0;
        int cnt2 = 0;
        for( i = 0; i < n ; i++) {
            if(cnt == 0) {
                el = nums[i];
                cnt = 1;
            } else if( el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        for( i = 0; i < n; i++) {
            if(nums[i] == el)
                cnt2++;
        }
        if( cnt2 > n/2 ) {
            return el;
        }
        return -1;
    }
}