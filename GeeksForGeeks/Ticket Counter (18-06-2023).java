class Solution {
    public static int distributeTicket(int N,int K)
    {
       int l = 1;
       int r = N;
       while(l<r){
           if(l+K<r){
               l = l+K;
           } else {
               return r;
           }
           if(r-K>l){
               r = r-K;
           } else {
               return l;
           }
       }
       return l;
    }
}
