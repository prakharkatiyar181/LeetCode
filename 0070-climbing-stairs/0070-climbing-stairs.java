class Solution {
    public int climbStairs(int n) {
        int[] mat1=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            mat1[i]=0;
        }
        for(int i=0;i<n+1;i++)
        {
            if(i==1||i==0)
                mat1[i]=1;
        }
        for(int i=2;i<n+1;i++)
        {
            if(mat1[i-2]!=0||mat1[i-1]!=0)
            {
                if(mat1[i-2]!=0&&mat1[i-1]!=0)
                {
                    mat1[i]=mat1[i-2]+mat1[i-1];
                }
                else if(mat1[i-1]!=0)
                {
                    mat1[i]=mat1[i-2]+mat1[i-1];
                }
            }
            else
                mat1[n]=mat1[i-1]+mat1[i-2];
        }
        return mat1[n];
    }
}