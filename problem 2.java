package problem2;

import java.util.Scanner;


public class TwoSum {

    // Time complexity: O(n^2)
    private static int[] FindTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Number Of elements Of Array");
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        System.out.println("enter array");
        for(int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        System.out.println("Enter target");
        int target = keyboard.nextInt();

        keyboard.close();

        int[] indices = FindTwoSum(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
            System.out.println("Elements Is");
            System.out.println(nums[indices[0]]+" "+ nums[indices[1]]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
