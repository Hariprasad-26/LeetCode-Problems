class Solution {
public:
    int reverse(int x) {

       
        long ans=0;
        while(x!=0)//123
        {
            long rev=x%10;
            ans=ans*10+rev;
            x=x/10;
        }
        if(INT_MAX<ans||INT_MIN>ans){
            return 0;
        }
        return ans; 
    }
};