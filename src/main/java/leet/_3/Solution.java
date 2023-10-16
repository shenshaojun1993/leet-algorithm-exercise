package main.java.leet._3;

public class Solution {
    public int lengthOfLongestSubString(String s) {
        if (s == null) {
            return 1;
        }
        int size = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (left <= right && s.substring(left, right).contains(s.charAt(right) + "")) {
                left++;
            }
            size = Math.max(size, right - left + 1);
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubString("aaaaaaa"));
    }
}
