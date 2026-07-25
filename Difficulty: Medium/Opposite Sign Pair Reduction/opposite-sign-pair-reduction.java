import java.util.*;

class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        Stack<Integer> st = new Stack<>();
        
        for (int num : arr) {
            boolean currentDestroyed = false;
            
            // Check for opposite signs (product of opposite signs is always negative)
            while (!st.isEmpty() && ((st.peek() > 0 && num < 0) || (st.peek() < 0 && num > 0))) {
                int top = st.peek();
                
                if (Math.abs(top) > Math.abs(num)) {
                    // Top of stack is larger, current element gets destroyed
                    currentDestroyed = true;
                    break; 
                } else if (Math.abs(top) < Math.abs(num)) {
                    // Current element is larger, top of stack gets destroyed
                    st.pop();
                } else {
                    // Both have equal absolute values, both get destroyed
                    st.pop();
                    currentDestroyed = true;
                    break;
                }
            }
            
            // If the current element survived all reductions, push it to stack
            if (!currentDestroyed) {
                st.push(num);
            }
        }
        
        // Return the final state as an ArrayList as expected by GFG
        return new ArrayList<>(st);
    }
}
