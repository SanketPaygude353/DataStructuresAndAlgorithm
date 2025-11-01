package ArraysQuestions.Easy;

//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


import java.util.Arrays;

public class LeetCode832 {

    public static int[][] flipAndInvertImage(int[][] image) {


        for(int row=0;row<image.length;row++)
        {
            int start=0;
            int end=image[row].length-1;

            while(start<=end)
            {
                int temp=image[row][start]^1;
                image[row][start]=image[row][end]^1;
                image[row][end]=temp;
                start++;
                end--;
            }
        }
//   for(int row=0;row<image.length;row++)
//     {
//         for(int col=0;col<image[row].length;col++)
//         {
//             image[row][col]=1^image[row][col];
//         }
//     }

        return image;
    }


    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] result = flipAndInvertImage(image);

        System.out.println("Flipped and Inverted Image:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
