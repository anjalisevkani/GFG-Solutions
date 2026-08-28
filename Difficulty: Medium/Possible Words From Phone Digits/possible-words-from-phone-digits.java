class Solution {

     String[] letters = {
         "", "", "abc", "def", "ghi",
         "jkl", "mno", "pqrs", "tuv", "wxyz"
     };

     public ArrayList<String> possibleWords(int[] arr) {

         ArrayList<String> ans = new ArrayList<>();

         generate(arr, 0, "", ans);

         return ans;
     }

     void generate(int[] arr, int index, String s,
                   ArrayList<String> ans) {

         if (index == arr.length) {
             ans.add(s);
             return;
         }
         if (arr[index] == 0 || arr[index] == 1) {
             generate(arr, index + 1, s, ans);
             return;
         }

         String str = letters[arr[index]];

         for (int i = 0; i < str.length(); i++) {
             generate(arr, index + 1,
                      s + str.charAt(i), ans);
         }
     }
 }