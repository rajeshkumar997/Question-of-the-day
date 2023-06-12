class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>();
        for(int i=0, j=0; j<n; j++){
            i = j;
            while(j+1 < n && nums[j+1] == nums[j] + 1){
                j++;
            }
            if(i==j){
                res.add(nums[i] + "");
            }
            else{
                res.add(nums[i] + "->" + nums[j]);
            }
        }
        return res;
    }
}
