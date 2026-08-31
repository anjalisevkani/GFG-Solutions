class Solution {
    public boolean solve(int i, int n, int[] arr, int k) {
        // Base case: if the sum k is 0, a subsequence is found
        if (k == 0) {
            return true;
        }
        // Base case: if k is negative, no valid subsequence can be found
        if (k < 0) {
            return false;
        }
        // Base case: if all elements are processed, check if k is 0
        if (i == n) {
            return k == 0;
        }
        // Recursive call: include the current element in the subsequence
        // or exclude the current element from the subsequence
        return solve(i + 1, n, arr, k - arr[i]) || solve(i + 1, n, arr, k);
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int n = arr.length; // Get the length of the input array
        return solve(0, n, arr, k); // Start the recursive process
    }
}