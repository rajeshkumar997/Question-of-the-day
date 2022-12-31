class Solution {
    private int res = 0;
    public int uniquePathsIII(int[][] grid) {
        int start_i = 0;
        int start_j = 0;
        int zeros = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    zeros++;
                }
                else if(grid[i][j] == 1){
                    start_i = i;
                    start_j = j;
                }
            }
        }
        countPaths(grid, start_i, start_j, zeros);
        return res;
    }
    public void countPaths(int[][] grid, int i, int j, int zeros){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1) return;
        if(grid[i][j] == 2 && zeros == -1) res++;
        if(grid[i][j] == 2 || zeros == -1) return;
        
        grid[i][j] = -1;

        countPaths(grid, i-1, j, zeros-1);
        countPaths(grid, i+1, j, zeros-1);
        countPaths(grid, i, j-1, zeros-1);
        countPaths(grid, i, j+1, zeros-1);
        
        grid[i][j] = 0;
    }
}
