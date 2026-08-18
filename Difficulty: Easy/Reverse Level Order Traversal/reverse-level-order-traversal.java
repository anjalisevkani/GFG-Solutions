/* Structure of Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public List<Integer> reverseLevelOrder(Node root) {
        // code here
        List<Integer> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.poll();

            ans.add(node.data);

            

            if (node.right != null)
                q.add(node.right);
            if (node.left != null)
                q.add(node.left);
        }
        Collections.reverse(ans);
        return ans;
    }
}