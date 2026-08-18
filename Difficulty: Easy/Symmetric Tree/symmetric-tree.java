/*
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
    public boolean isSymmetric(Node root) {
        // code here
        if(root==null){
            return true;
        }
        return isSymmetricUtil(root.left,root.right);
    }
    private boolean isSymmetricUtil(Node r1,Node r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        return (r1.data==r2.data) && isSymmetricUtil(r1.left,r2.right) && isSymmetricUtil(r1.right,r2.left);
    }
}