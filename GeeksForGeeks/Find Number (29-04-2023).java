class Solution
{
    public long findNumber(long N)
    {
        long[]arr={9,1,3,5,7};
        long res=0,mul=1;
        while(N>0)
        {
            int rem=(int)(N%5);
            res=res+arr[rem]*mul;
            mul*=10;
            if(N%5==0)N--;
            N/=5;
        }
        return res;
    }
}
