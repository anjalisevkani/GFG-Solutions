/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
                if(root==null){
                    return ans;
                }
                Queue<Node> q=new LinkedList<>();
                q.add(root);
                while (!q.isEmpty()) {

                    int size = q.size();

                    for (int i = 0; i < size; i++) {

                        Node node = q.poll();

                        // Last node of this level
                        if (i == size - 1) {
                            ans.add(node.data);
                        }

                        if (node.left != null) {
                            q.add(node.left);
                        }

                        if (node.right != null) {
                            q.add(node.right);
                        }
                    }
                }

                return ans;
            }
        }
    