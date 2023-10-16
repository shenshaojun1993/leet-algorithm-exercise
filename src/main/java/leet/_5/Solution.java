package main.java.leet._5;

public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 1) {
            return s;
        }
        String[] sArrays = s.split("");
        int max = 1;
        String maxStr = "";
        for (int i = 0; i < length; i++) {
            int currentLength = 1;
            int begin = i;
            int end = i;
            while (begin >= 0 && sArrays[begin].equals(sArrays[i])) {
                begin --;
                currentLength ++;
            }
            while (end < length && sArrays[end].equals(sArrays[i])) {
                end ++;
                currentLength ++;
            }
            while (begin >= 0 && end < length && sArrays[begin].equals(sArrays[end])) {
                begin --;
                end ++;
                currentLength += 2;
            }
            if (currentLength > max) {
                max = currentLength;
                maxStr = s.substring(begin + 1, end);
            }
        }
        return maxStr;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("cbbd"));
    }
}
