/* Binary Tree Node Structure
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    boolean isCompleteBT(Node root) {
        if(root==null){
            return true;
        }
        boolean nullFound=false;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node=q.poll();
            if(node==null){
                nullFound=true;
            }else{
                if(nullFound){
                    return false;
                }
                q.add(node.left);
                q.add(node.right);
            }
        }
        return true;
    }
}