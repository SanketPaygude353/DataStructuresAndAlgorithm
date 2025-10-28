package ArraysQuestions.Easy;

//1672. Richest customer wealth
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.
public class Leetcode1672 {

    int max=0;
    public static int maximumWealth(int[][] accounts)
    {
        int max=0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
             sum += accounts[i][j];
            }

            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] account={{1, 2, 3},{3,2,1}};
        System.out.println(maximumWealth(account));
    }

}
