class Solution {
    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        func(0,arr,new ArrayList<>(),ans);
        return ans;
    }
    void func(int index,int[] arr,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            func(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }

    }
}
