class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        String curstr="";
        for(int i=0;i<strs.length;i++)
        {
            if(min>strs[i].length())
            {
                min=strs[i].length();
                curstr=strs[i];
            }
        }
        int count=0;
        for(int i=0;i<min;i++)
        {
            for(String s:strs)
            {
                if(s.charAt(i)!=curstr.charAt(i))
                {
                    return s.substring(0,count);
                }
            }
            count++;
        }
        return curstr;
    }
}