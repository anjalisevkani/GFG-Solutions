/* Structure of a Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    int preIndex=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public  Node buildTree(int inorder[], int preorder[]) {
        // code here
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    private Node build(int[] preorder,int left,int right){
        if(left>right){
            return null;
        }
        int value=preorder[preIndex++];
        Node root=new Node(value);
        int index=map.get(value);
        root.left=build(preorder,left,index-1);
        root.right=build(preorder,index+1,right);
        return root;
    }
}