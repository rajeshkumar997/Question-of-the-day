class Solution {
    public double average(int[] salary) {
       int n = salary.length;
        int minSalary = Integer.MAX_VALUE, maxSalary = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            minSalary = Math.min(minSalary, salary[i]);
            maxSalary = Math.max(maxSalary, salary[i]);
            sum += salary[i];
        }
        sum -= (minSalary + maxSalary);
        return (double)sum / (n - 2);
    }
}
