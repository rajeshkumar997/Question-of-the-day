class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        
        int ans =0;
        int count =0;
        int i =0, j=0;
        while(i<N){
            if(start[i] < end[j]){
                count++;
                ans = Math.max(ans, count);
                i++;
            }
            else{
                count--;
                j++;
            }
        }
        return ans;
    }
}
