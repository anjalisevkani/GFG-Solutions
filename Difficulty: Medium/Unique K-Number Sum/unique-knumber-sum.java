class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        func(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
    void func(int start,int k,int n,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        if(k==0){
            if(n==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=start;i<=9;i++){
            if(i>n){
                break;
            }
            temp.add(i);
            func(i+1,k-1,n-i,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}