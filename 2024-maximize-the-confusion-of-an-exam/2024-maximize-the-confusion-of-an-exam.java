class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      if(k>=answerKey.length())
       return answerKey.length(); 
        int i=0;//start of window
        int j=0;//end of window
        int ct=0;//to maintain the count of 'T'
        int cf=0;//to maintain the count of 'F'
        int ans=0;
        while(j<answerKey.length())
        {
            if(answerKey.charAt(j)=='T')
            ct++;
            else 
            cf++;

            while(ct>k && cf>k)//if the counts of both 'T' and 'F' exceeds k ,then we need to shorten our window by excluding elements, so we will increment i until either ct or cf gets <=k.
            {
              if(answerKey.charAt(i)=='T')
                ct--;
              else 
                cf--;
                i++;
            }  
         
             ans=Math.max(ans,j-i+1);//updating the possible answer each time.
             j++;

        }
        return ans;
    }
}