import java.util.*;

class Solution {
    public int maxArea(int[][] matrix) {

        if (matrix.length == 0)
            return 0;

        int m = matrix[0].length;
        int[] height = new int[m];
        int maxArea = 0;

        // Process each row
        for (int[] row : matrix) {

            // Build histogram
            for (int i = 0; i < m; i++) {
                if (row[i] == 1)
                    height[i]++;
                else
                    height[i] = 0;
            }

            // Find largest rectangle in histogram
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }

        return maxArea;
    }

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        // Add one extra bar of height 0
        int[] newHeights = Arrays.copyOf(heights, heights.length + 1);

        for (int i = 0; i < newHeights.length; i++) {

            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {

                int height = newHeights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}