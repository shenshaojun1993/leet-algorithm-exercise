package main.java.leet._7;

public class Solution {
    /**
     *  x = 123
     *  123 % 10 = 3, 3 * 10
     *  12 % 10 = 2
     *  1 % 10 = 1
     *  x = 0
     *  Integer的最大值为2147483647
     *  Integer的最大值为2147483648
     *  Integer的最大值为2147483649
     *  Integer的最大值为2147483650
     *  Integer的最大值为2147483651
     *
     * @param x 待反转的数字
     * @return 反转后的数字
     */
    public int reverse(int x) {
        int max = Integer.MAX_VALUE / 10;
        int temp;
        int res = 0;
        while (x != 0) {
            temp = x % 10;
            if (res > max || (temp > 7 && x == max)) {
                return 0;
            }
            if (res < -max || (temp < -8 && x == -max)) {
                return 0;
            }
            res =  res * 10 + temp;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(1234567));
    }
}
