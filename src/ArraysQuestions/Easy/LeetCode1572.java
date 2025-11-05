package ArraysQuestions.Easy;

public class LeetCode1572 {

    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum+=mat[i][j];
                }
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        LeetCode1572 l = new LeetCode1572();
        int result = l.diagonalSum(mat);
        System.out.println("Diagonal Sum: " + result);
    }
}
