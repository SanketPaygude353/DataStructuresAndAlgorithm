package ArraysQuestions.Easy;
import java.util.ArrayList;
import java.util.List;
//kids with greatest number of candies
//Input: candies = [4,2,1,1,2], extraCandies = 1
//Output: [true,false,false,false,false]
//Explanation: There is only 1 extra candy.
//Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.

public class LeetCode1431 {


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List <Boolean>ans=new ArrayList<Boolean>();

        int maxC=0;
        for(int candy:candies){
            maxC=Math.max(maxC,candy);
        }

        for(int candy:candies){
            if(candy+extraCandies >= maxC)
                ans.add(true);
            else
                ans.add(false);
        }

        return ans;
    }

    public static void main(String[] args) {
        LeetCode1431 sol = new LeetCode1431();

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = sol.kidsWithCandies(candies, extraCandies);

        System.out.println(result);
    }
}
