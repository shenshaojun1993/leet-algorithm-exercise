package main.java.leet._31;

import java.util.Arrays;

public class Solution {
	private static final Solution solution = new Solution();

	public void nextPermutation(int[] nums) {
		int len = nums.length;
		if(len == 1) {
			return;
		}

		for (int i = len - 1; i > 0; i--) {
			if (nums[i] > nums[i-1]) {
				// 从i后面找一个比nums[i-1]更大的数字
				for (int j = len - 1; j >= i; j--) {
					if (nums[j] > nums[i-1]) {
						swap(nums, i - 1, j);
						reverse(nums, i, len - 1);
						break;
					}
				}
				return;
			}
		}
		reverse(nums, 0 , len -1);
	}

	/**
	 * 按照起始和结束反转数组
	 *
	 **/
	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}

	private void swap (int[] nums, int start, int end) {
		int temp = nums[end];
		nums[end] = nums[start];
		nums[start] = temp;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1, 5, 4, 3, 2};
		solution.nextPermutation (nums);
		System.out.println (Arrays.toString (nums));
	}

	// 1, 5, 4, 3, 2
}
