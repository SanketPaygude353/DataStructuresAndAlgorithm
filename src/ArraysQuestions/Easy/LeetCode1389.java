package ArraysQuestions.Easy;

import java.util.ArrayList;
import java.util.Arrays;

//1389. Create Target Array in the Given Order
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//        Output: [0,4,1,3,2]
//        Explanation:
//        nums       index     target
//        0            0        [0]
//        1            1        [0,1]
//        2            2        [0,1,2]
//        3            2        [0,1,3,2]
//        4            1        [0,4,1,3,2]

public class LeetCode1389 {

    public static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i]=list.get(i);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
}
