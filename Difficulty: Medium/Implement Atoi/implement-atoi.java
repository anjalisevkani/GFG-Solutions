class Solution {

     static int helper(String s, int i, long num, int sign) {

         if (i == s.length() || !Character.isDigit(s.charAt(i))) {
             return (int)(sign * num);
         }

         int digit = s.charAt(i) - '0';

         // Check overflow BEFORE adding digit
         if (num > (Integer.MAX_VALUE - digit) / 10) {
             return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
         }

         num = num * 10 + digit;

         return helper(s, i + 1, num, sign);
     }

     public static int myAtoi(String s) {

         int i = 0;

         while (i < s.length() && s.charAt(i) == ' ') {
             i++;
         }

         int sign = 1;

         if (i < s.length() &&
             (s.charAt(i) == '+' || s.charAt(i) == '-')) {

             if (s.charAt(i) == '-') {
                 sign = -1;
             }

             i++;
         }

         return helper(s, i, 0, sign);
     }
 }