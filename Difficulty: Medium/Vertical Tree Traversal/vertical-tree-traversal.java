/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair p = q.poll();

            Node node = p.node;
            int hd = p.hd;

            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(node.data);

            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }

            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }

        for (ArrayList<Integer> list : map.values()) {
            ans.add(list);
        }

        return ans;
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}