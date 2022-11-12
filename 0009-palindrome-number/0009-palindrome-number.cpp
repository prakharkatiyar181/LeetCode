class Solution {
public:
    // int reverseA(int x)
    // {
    //     long c=0;
    //     while(x>0){
    //         int digit=x%10;
    //         c=c*10 + digit;
    //         x=x/10;
    //     }
    //     return c;
    // }
    bool isPalindrome(int a) {
        //  int n=x;
        // if(n<0)
        //     return false;
        // int a=reverseA(n);
        // if(a==n)
        //     return true;
        // return false;
        if(a<0||(a%10==0&&a!=0))
            return false;
        int b=0;
        while(a>b)
        {
            b=b*10+a%10;
            a=a/10;
        }
        return a==b||a==b/10;
    }
};