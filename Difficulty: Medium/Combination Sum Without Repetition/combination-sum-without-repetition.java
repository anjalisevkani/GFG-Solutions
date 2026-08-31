class Solution {
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] candidates, int target) {
        // code here
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        find(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    void find(int[] candidates,int index,int target,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
         if(target==0){
             ans.add(new ArrayList<>(temp));
             return;
         }

         for(int i=index;i<candidates.length;i++){
             if(i>index && candidates[i]==candidates[i-1]){
                 continue;
             }
             if(candidates[i]>target){
                 break;
             }
             temp.add(candidates[i]);
             find(candidates, i + 1,target - candidates[i], temp, ans);
             temp.remove(temp.size()-1);
         }
     }
}