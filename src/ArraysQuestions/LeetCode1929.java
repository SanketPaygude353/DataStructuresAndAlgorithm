package ArraysQuestions;

//1929. Concatenation of the array
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]

import java.util.Arrays;

public class LeetCode1929 {
    public static int[] getConcatination(int[] nums)
    {
        int n = nums.length;
        int[] arr = new int[2*n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[n+i] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatination(nums)));
    }
}
