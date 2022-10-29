class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        str1.append(a);
        a=str1.reverse().toString();
        // System.out.println(a);
        str2.append(b);
        b=str2.reverse().toString();
        // System.out.println(b);
        int x=a.length();
        int y=b.length();
        if(x==0)
            return b;
        if(y==0)
            return a;
        int i=0,j=0,carry=0,curr=0;
        String ans="";
        while(i<x&&j<y)
        {
            curr=(int)a.charAt(i++)-'0'+(int)b.charAt(j++)-'0'+carry;
            carry=curr/2;
            ans=ans+Integer.toString(curr%2);
        }
        while(j<y)
        {
            curr=(int)b.charAt(j++)-'0'+carry;
            carry=curr/2;
            ans=ans+Integer.toString(curr%2);
        }
        while(i<x)
        {
            curr=(int)a.charAt(i++)-'0'+carry;
            carry=curr/2;
            ans=ans+Integer.toString(curr%2);
        }
        StringBuilder str=new StringBuilder();
        str.append(ans);
        ans=str.reverse().toString();
        if(carry!=0)
        {
            ans=Integer.toString(carry)+ans;
            System.out.println(ans);
        }
        
        return ans;
    }
}