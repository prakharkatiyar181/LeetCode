// import java.util.collections;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int value = 0;
        int key = 0;
        int maxValue = 0;
        int el = 0;
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        for( int i=0; i<n ;i++) {
            value = mpp.getOrDefault(nums[i],0);
            value += 1;
            mpp.put(nums[i], value);
        }
        for(Map.Entry<Integer, Integer> val: mpp.entrySet()) {
            if(maxValue < val.getValue()) {
                maxValue = val.getValue();
                el = val.getKey();
            }
        }
        if( maxValue > n/2) {
           return el; 
        }
        return -1;
        // int max = collections.max(mpp.keySet())
        
    }
}