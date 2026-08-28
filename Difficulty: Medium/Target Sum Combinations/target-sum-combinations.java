class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] candidates, int target) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        findCandidates(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    void findCandidates(int[] candidates,int index,int target,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;

        }
        if(index==candidates.length || target<0){
            return;
        }
        temp.add(candidates[index]);
        findCandidates(candidates,index,target-candidates[index],temp,ans);
        temp.remove(temp.size()-1);
        findCandidates(candidates,index+1,target,temp,ans);
    }
}