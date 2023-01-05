class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int result = 0, count = 0;
        for (int i = 0; i < tasks.length; i++) {
            count++;
            if (i == tasks.length - 1 || tasks[i] != tasks[i + 1]) {
                if (count == 1) {
                    return -1;
                }
                result += count / 3;
                if(count % 3 != 0) result++;               
                count = 0;
           }
        }
        return result;
    }
}
