class Solution {
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       ArrayList<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                max = Math.max(max, curr.data);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}
