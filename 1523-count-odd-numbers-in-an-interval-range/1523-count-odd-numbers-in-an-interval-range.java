class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int i=low;
        if(i%2==0) 
            i=i+1;
        while(i<=high) {
            count++;
            i += 2;
        }
        return count;
    }
}