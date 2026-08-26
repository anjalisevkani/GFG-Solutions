/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */


class Solution {
    Node prev=null;
    boolean ans=true;
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(prev==null){
            prev=root;
        }else{
            if(root.data<=prev.data){
                ans=false;
            }
            prev=root;
        }
        inorder(root.right);


    }

    boolean isBST(Node root) {
         inorder(root);
         return ans;
    }
 }