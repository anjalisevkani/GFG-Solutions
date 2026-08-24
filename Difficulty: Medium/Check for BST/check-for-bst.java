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
     Node prev = null;

     boolean isBST(Node root) {
         if (root == null) {
             return true;
         }

         // Check left subtree
         if (!isBST(root.left)) {
             return false;
         }

         // Check current node
         if (prev != null && root.data <= prev.data) {
             return false;
         }

         prev = root;

         // Check right subtree
         return isBST(root.right);
     }
 }