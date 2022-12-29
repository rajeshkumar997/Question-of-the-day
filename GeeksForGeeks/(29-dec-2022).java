class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++) {
        if(asteroids[i] > 0 || stack.isEmpty() || stack.peek() < 0) {
        stack.push(asteroids[i]);
        }
        else {
        while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
        stack.pop();
        }
        if(stack.isEmpty() || stack.peek() < 0) {
        stack.push(asteroids[i]);
        }
        else if(stack.peek() == Math.abs(asteroids[i])) {
        stack.pop();
        }
        }
        }
        int[] result = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--) {
        result[i] = stack.pop();
        }
        return result;
    }
}
