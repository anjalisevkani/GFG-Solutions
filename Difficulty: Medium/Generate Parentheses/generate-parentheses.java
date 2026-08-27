class Solution {

    public ArrayList<String> generateParentheses(int n) {

        ArrayList<String> ans = new ArrayList<>();

        generate("", 0, 0, n / 2, ans);

        return ans;
    }

    void generate(String s, int open, int close, int pairs,
                  ArrayList<String> ans) {

        // String has reached required length
        if (s.length() == 2 * pairs) {
            ans.add(s);
            return;
        }

        // Add opening bracket
        if (open < pairs) {
            generate(s + "(", open + 1, close, pairs, ans);
        }

        // Add closing bracket only when valid
        if (close < open) {
            generate(s + ")", open, close + 1, pairs, ans);
        }
    }
}