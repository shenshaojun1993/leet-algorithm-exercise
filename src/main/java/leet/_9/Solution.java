package main.java.leet._9;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(33));
        ;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10 && x >= 0) {
            return true;
        } else {
            int res = 0;
            while (x > res) {
                res = res * 10 + x % 10;
                x /= 10;
            }
            return x == res || x == res / 10;

        }
    }
}
