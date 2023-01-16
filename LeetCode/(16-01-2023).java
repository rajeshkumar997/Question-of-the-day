class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        for (int[] interval : intervals) pq.add(interval);
        pq.add(newInterval);
        
        List<int[]> res = new ArrayList<>(); 
        int[] prev = pq.poll();        
        while (!pq.isEmpty()) {             
            int[] cur = pq.poll();
            if (prev[1] >= cur[0]) {
                prev = new int[]{prev[0], Math.max(cur[1], prev[1])};
            } else {
                res.add(prev);
                prev = cur;
            }
        }
        res.add(prev);       
        return res.toArray(new int[res.size()][]);
    }
}
