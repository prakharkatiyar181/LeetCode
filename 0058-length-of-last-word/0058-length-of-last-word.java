class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        String[] arr=s.split(" ");
        if(arr.length==0)
            return ans;
        else if(arr.length==1)
            return arr[0].length();
        int x=arr.length-1;
        ans=arr[x].length();
        return ans;
    }
}