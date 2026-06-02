public class Solution {
    public int trap(int[] height) {
    int ans = 0;
    Deque<Integer> stack = new ArrayDeque<>();
    
    for (int i = 0; i < height.length; i++) {
        while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
            int top = stack.pop();
            if (stack.isEmpty()) break;
            
            int distance = i - stack.peek() - 1;
            int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
            ans += distance * boundedHeight;
        }
        stack.push(i);
    }
    return ans;
    }
}