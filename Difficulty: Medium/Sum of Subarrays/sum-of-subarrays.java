class Solution {
    public int subarraySum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        
        // Loop through each element and calculate its contribution
        for (int i = 0; i < n; i++) {
            // Number of subarrays containing arr[i]
            int frequency = (i + 1) * (n - i); 
            
            totalSum += arr[i] * frequency;
        }
        
        return totalSum;
    }
}