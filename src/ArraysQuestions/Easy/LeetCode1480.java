package ArraysQuestions.Easy;
//1480.Running sum of 1D array
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

import java.util.Arrays;

public class LeetCode1480 {

    public static int[] runningSum(int[] nums){

        int[] newArr=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum=0;

            for (int j = 0; j <= i; j++) {
                sum=sum+nums[j];
            }
            newArr[i]=sum;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

}
