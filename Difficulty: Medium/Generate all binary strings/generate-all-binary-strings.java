class Solution {

    public ArrayList<String> binstr(int n) {

        ArrayList<String> ans = new ArrayList<>();
        findPaths(n, 0, ans, "");

        return ans;
    }

    void findPaths(int n, int index,
                   ArrayList<String> ans, String diary) {

        if (index == n) {
            ans.add(diary);
            return;
        }

        findPaths(n, index + 1, ans, diary + "0");

        findPaths(n, index + 1, ans, diary + "1");
    }
}