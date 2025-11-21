package ArraysQuestions.Easy;

//53.Maximum Subarray
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class LeetCode053 {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }


    public static int maxSubArray(int[] nums) {
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // for(int i =0; i < n; i++)
        // {
        //     int sum = 0;
        //     for(int j = i; j < n; j++)
        //     {
        //         sum += nums[j];
        //         max = Math.max(max, sum);
        //     }
        // }
        // return max;


        long max = Long.MIN_VALUE;
        long sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];

            if(sum > max)
            {
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return (int) max;
    }
}
