class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el = 0;
        int cnt = 0;
        int cnt1 = 0;
        for(int i = 0; i < n; i++) {
            if(cnt == 0) {
                el = nums[i];
                cnt = 1;
            } else if(el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        for(int i = 0 ; i<n ; i++) {
            if(nums[i] == el) {
                cnt1++;
            }
        }
        if(cnt1 > n/2) {
            return el;
        }
        return el;
    }
}