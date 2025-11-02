package ArraysQuestions.Easy;

//1252. Cells with Odd Values in a Matrix
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
public class LeetCode1252 {

    public static int oddCells(int m, int n, int[][] indices) {

        int[][] ans=new int[m][n];

        for(int i=0;i<indices.length;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[indices[i][0]][j]++;
            }

            for(int j=0;j<m;j++)
            {
                ans[j][indices[i][1]]++;
            }
        }

        int count=0;

        for(int row=0;row<ans.length;row++)
        {
            for(int col=0;col<ans[row].length;col++){
                if(ans[row][col]%2!=0)
                {
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int[][] mat = {{0, 1}, {1, 1}};
        System.out.println(oddCells(2,3,mat));

    }

}
