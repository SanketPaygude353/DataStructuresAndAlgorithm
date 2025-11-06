package ArraysQuestions.Easy;

public class LeetCode1295 {

    public static int findNumbers(int[] nums) {
        int evenCount=0;
        for(int num:nums)
        {
            int count=0;
            while(num>0)
            {
                num/=10;
                count++;
            }
            if(count%2==0)
                evenCount++;
        }
        return evenCount;
    }

    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }

}
