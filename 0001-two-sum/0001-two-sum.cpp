class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> m1;
        for(int i=0;i<nums.size();i++)
        {
            int comp=target-nums[i];
            if(m1.count(comp))
            {
                return {m1[comp],i};
            }
            else
            {
                m1[nums[i]]=i;
            }
        }
        return {};
    }
};