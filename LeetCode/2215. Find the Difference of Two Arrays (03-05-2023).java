class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        // Create hash sets for nums1 and nums2
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        // Find the difference between set1 and set2
        for (int num : set1) {
            if (!set2.contains(num)) {
                diff1.add(num);
            }
        }

        // Find the difference between set2 and set1
        for (int num : set2) {
            if (!set1.contains(num)) {
                diff2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(diff1);
        result.add(diff2);
        return result;
    }
}
