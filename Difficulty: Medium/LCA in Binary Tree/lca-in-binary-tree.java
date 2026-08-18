/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
}*/

class Solution {
    Node ans=null;
    Node lca(Node root, int n1, int n2) {
        // code here
        findLCA(root,n1,n2);
        return ans;
        
    }
    private int findLCA(Node node,int n1,int n2){
        if(node==null){
            return 0;
        }
        int left=findLCA(node.left,n1,n2);
        int right=findLCA(node.right,n1,n2);
        int self=0;
        if(node.data==n1||node.data==n2){
            self=1;
        }
        int total=left+self+right;
        if(total==2 && ans==null){
            ans=node;
        }
        return total;
        
    }
}