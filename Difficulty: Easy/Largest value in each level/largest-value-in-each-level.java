class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                Node node=q.poll();
                max=Math.max(max,node.data);
                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(max);

        }
        return ans;
    }
}