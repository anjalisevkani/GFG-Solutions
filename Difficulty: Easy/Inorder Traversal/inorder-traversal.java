/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        in(root,arr);
        return arr;
        
    }
    public void in(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        in(root.left,arr);
        arr.add(root.data);
        in(root.right,arr);
    }
}