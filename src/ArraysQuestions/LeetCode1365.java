package ArraysQuestions;

//How Many Numbers Are Smaller Than the Current Number
//Input: nums = [6,5,4,8]
//Output: [2,1,0,3]

import java.util.Arrays;

public class LeetCode1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] ans=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(i==j)continue;

                if(nums[i]>nums[j])count++;
            }
            ans[i]=count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
