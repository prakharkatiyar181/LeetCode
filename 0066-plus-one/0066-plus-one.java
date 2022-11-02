class Solution {
    public int[] plusOne(int[] digits) {
        int x=digits.length-1;
        if(digits[x]>=0&&digits[x]<9)
        {
            digits[x]++;
            return digits;
        }
        for(int i=x;i>=0;i--)
        {
            if(digits[i]==9)
            {
                digits[i]=0;
            }
            else
            {
                digits[i]++;
                break;
            }
        }
        boolean flag=true;
        for(int i:digits)
        {
            if(i!=0)
            {
                flag=false;
            }
        }
        
        int[] arr=new int[x+2];
        if(flag==false)
            return digits;
        
        else
        {    
            arr[0]=1;
            
        }
        return arr;
    }
}