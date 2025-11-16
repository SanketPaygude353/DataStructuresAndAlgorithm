package ArraysQuestions.Easy;
//867. Transpose MAtrix
//Example 1:
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]

import java.util.Arrays;

public class LeetCode867 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int row=0;row<matrix.length;row++){

            for(int col=0;col<matrix[row].length;col++){
                ans[col][row]=matrix[row][col];
            }
        }
        return ans;
    }

}
