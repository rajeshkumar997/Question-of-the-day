class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < N ; i ++){
            pq.add(A[i]);
        }
        long sum = 0;
        for(int i = 0 ; i < K ; i ++){
            int curr = pq.peek();
            sum += curr;
            pq.poll();
            pq.add(curr/2);
        }
        return sum;
    }
};
