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
    int count=0;
    Node prev=null;
    Node a,b,c,d=null;
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(prev==null){
            prev=root;
        }else{
            if(root.data<prev.data){
                if(count==0){
                    a=prev;
                    b=root;
                    count++;
                }else{
                    c=prev;
                    d=root;
                    count++;
                }
            }
            prev=root;
        }
        inorder(root.right);
        
    }
    public Node correctBST(Node root) {
        // code here
        inorder(root);
        if(count==1){
            swap(a,b);
        }else{
            swap(a,d);
        }
        return root;
        
    }
    public void swap(Node a,Node b){
        int temp=a.data;
        a.data=b.data;
        b.data=temp;
    }
};