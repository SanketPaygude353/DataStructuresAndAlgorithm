package ArraysQuestions.Easy;

//Find the highest altitude
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

public class LeetCode1732 {

    public static int largestAltitude(int[] gain) {

        int matt=0;
        int catt=0;

        for(int i=0;i<gain.length;i++)
        {
            catt+=gain[i];
//             matt=findMax(matt,catt);
//
//            or we can do like this
            matt=Math.max(matt,catt);
        }
        return matt;
    }
    public static void main(String[] args) {

        int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
