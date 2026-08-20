/* Node is as follows:
class Tree
{
    int data;
    Tree left,right;
    Tree(int d){
        data = d;
        left = null;
        right = null;
    }
}*/
class Solution {
    int totalSum=0;
    public  int treePathsSum(Node root) {
        // code here.
        pathSum(root,0);
        return totalSum;
    }
    private  void pathSum(Node root,int currentSum){
        if(root==null){
            return;
        }
        currentSum=(currentSum*10)+root.data;
        if(root.left==null && root.right==null){
            totalSum+=currentSum;
            return;
        }
        pathSum(root.left,currentSum);
        pathSum(root.right,currentSum);
    }
}