class Solution {
  public int longestSubarray(int[] nums) {
    int zeroIndex = -1, max = 0, n = nums.length;

    for (int l=0, r=0; r<n; r++) {
      if (nums[r] == 0) {
        l = zeroIndex + 1;
        zeroIndex = r;
      }
      max = Math.max(max, r-l);
    }
    return max;
  }
}