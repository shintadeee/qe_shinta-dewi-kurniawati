package twosum;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 11};
        int target = 11;
        int[] result = findTwoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}

