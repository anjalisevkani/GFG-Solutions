/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    boolean res=false;
    /*you are required to complete this function */
    private void pathSum(Node root, int sum, int target) {
        if(root==null){
            return;
        }

        sum+=root.data;
        if(root.left==null && root.right==null){
            if(sum==target){
                res=true;
            }
            return;
        }
        pathSum(root.left,sum,target);
        pathSum(root.right,sum,target);

    }
    boolean hasPathSum(Node root, int target) {
        pathSum(root,0,target);
        return res;

    }
}