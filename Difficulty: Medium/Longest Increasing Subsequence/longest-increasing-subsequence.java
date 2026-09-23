class Solution {
    public int lis(int arr[]) {
        // code here
        int n=arr.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    res[i]=Math.max(res[i],res[j]+1);
                }
            }
            
        
        }
        int ans=1;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,res[i]);
        }
        return ans;
        
        
    }
    
}