class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char,int> m1;
        // char I,V,X,L,C,D,M;
        m1['I']=1;
        m1['V']=5;
        m1['X']=10;
        m1['L']=50;
        m1['C']=100;
        m1['D']=500;
        m1['M']=1000;
        
        if(s.length() == 1) {
            return m1[s[0]];
        }
    
    
        int ans=0;
        int x=s.length() - 1;
        cout<<x<<" "<<s[x]<<endl;
        char c=s[x];
        ans=m1[c];
        // char v;
        for(int i = s.length() - 2; i >= 0; i--)
        {
            // cout<<ans;
            // v=s[i];
            
            // cout<<"ll"<<v<<endl;
            if(m1[s[i]]>=m1[s[i + 1]])
            {
                // cout<<"1"<<endl;
                ans+=m1[s[i]];
                // cout<<v<<" "<<m1[v]<<endl;
                // c=s[i];
            }
            else
            {
                // cout<<"2";
                ans-=m1[s[i]];
            }
        }
        return ans;
        
    }
};