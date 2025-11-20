package ArraysQuestions.Easy;
//1304. Find N unique integers sum up to zero
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

import java.util.Arrays;

public class LeetCode1304 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] ans=new int[n];
        int index=0;

        if(n%2==1){
            ans[index++]=0;
        }

        for(int i=1;index<n;i++)
        {
            ans[index++]=i;
            ans[index++]=-i;
        }

        return ans;
    }
}