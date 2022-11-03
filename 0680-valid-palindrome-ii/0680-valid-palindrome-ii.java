class Solution {
    public boolean helper(String s, int a,int b, boolean isremoved) {
        boolean ans1=false,ans2=false;
        if(a>=b){
            return true;
        }
        if(s.charAt(a)==s.charAt(b)){
            return helper(s,a+1,b-1,isremoved);
        }
        else if(s.charAt(a)!=s.charAt(b) && !isremoved) {
            ans1=helper(s,a,b-1,true);
            if(ans1==true){
                System.out.println("here1");
                return true;
            }
            ans2=helper(s,a+1,b,true);
            if(ans2==true){
                System.out.println("here2");
                return true;
            }
        }
        return false;
    }
    public boolean validPalindrome(String s) {
        return helper(s,0,s.length()-1,false);
    }
}