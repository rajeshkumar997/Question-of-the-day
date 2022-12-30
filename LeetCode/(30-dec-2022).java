class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new LinkedList();
        List<Integer> curr = new ArrayList();
        curr.add(0);
        dfs(0, curr,graph, graph.length - 1, res);
        return res;
    }
    void dfs(int source, List<Integer> curr, int graph[][], int n, List<List<Integer>> res){
        if(source == n){
            res.add(new ArrayList(curr));
            return;
        }
        for(int a : graph[source]){
            curr.add(a);
            dfs(a,curr,graph,n,res);
            curr.remove(curr.size()-1);
        }
    }
}
