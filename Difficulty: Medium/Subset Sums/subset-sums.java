class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int N=arr.length;
        ArrayList<Integer> sumSubset=new ArrayList<>();
        func(0,0,arr,N,sumSubset);
        return sumSubset;
    }
    void func(int ind,int sum,int[] arr,int N,ArrayList<Integer> sumSubset){
        if(ind==N){
            sumSubset.add(sum);
            return;
        }
        func(ind+1,sum+arr[ind],arr,N,sumSubset);
        func(ind+1,sum,arr,N,sumSubset);
        
    }
}