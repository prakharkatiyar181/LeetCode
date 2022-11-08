class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        long ans=Integer.MIN_VALUE;
        Set<Character> s1 = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            int sum=1;
            for(int j=i+1;j<s.length();j++){
                char a=s.charAt(i);
                char b=s.charAt(j);
                if(Character.compare(a,b)==0){
                    break;
                }
                else if(!s1.contains(b)){
                    s1.add(b);
                    sum=sum+1;
                }
                else
                    break;
            }
            ans=Math.max(sum,ans);
            s1.clear();
        }
        return (int)ans;
    }
}