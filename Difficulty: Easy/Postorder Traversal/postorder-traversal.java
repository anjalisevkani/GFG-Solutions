/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        post(root,arr);
        return arr;

    }
    public void post(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        post(root.left,arr);
        post(root.right,arr);
        arr.add(root.data);
    }
    
}