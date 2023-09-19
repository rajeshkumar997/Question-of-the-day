class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n= nums.length;
        for(int i=0; i<n; i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return n;
    }
}
