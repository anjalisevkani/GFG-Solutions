/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int maxLevelSum(Node root) {
        // code here
        int maxSum=Integer.MIN_VALUE;
        
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            

            int size = q.size();
            int lvlSum = 0;

            for (int i = 0; i < size; i++) {

                Node node = q.poll();

                lvlSum += node.data;

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
                    
            if(lvlSum>maxSum){
                maxSum=lvlSum;
                
            }



        }
        return maxSum;
    }
}
    
