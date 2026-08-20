/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    boolean findTarget(Node root, int target) {
        if(root==null){
            return false;
        }
        Stack<Node> leftStack=new Stack<>();
        Stack<Node> rightStack=new Stack<>();
        pushLeft(root,leftStack);
        pushRight(root,rightStack);
        while(!leftStack.isEmpty() && !rightStack.isEmpty()){
            Node leftNode=leftStack.peek();
            Node rightNode=rightStack.peek();
            if(leftNode==rightNode){
                break;
            }
            int sum=leftNode.data+rightNode.data;
            if(sum==target){
                return true;
            }
            if(sum<target){
                Node node=leftStack.pop();
                pushLeft(node.right,leftStack);
            }else{
                Node node=rightStack.pop();
                pushRight(node.left,rightStack);
            }


        }
        return false;
    }
    private void pushLeft(Node root, Stack<Node> stack){
        while(root!=null){
            stack.push(root);
            root=root.left;

        }
    }
    private void pushRight(Node root, Stack<Node> stack){
        while(root!=null){
            stack.push(root);
            root=root.right;

        }
    }
}
    
        
    