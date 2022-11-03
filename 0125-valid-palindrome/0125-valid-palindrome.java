class Solution {
    public boolean helper(String s){
        char ch1,ch2;
        for(int i=0;i<s.length()/2;i++){
            ch1=s.charAt(i);
            ch2=s.charAt(s.length()-i-1);
            if(ch1!=ch2)
                return false;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        char ch;
        String ans="";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch==' ')
                continue;
            int ascii = ch;
            if((ascii>=48&&ascii<=57)||(ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)){
                ans=ans+ch;
            }
        }
        ans=ans.toLowerCase();
        return helper(ans);
    }
}