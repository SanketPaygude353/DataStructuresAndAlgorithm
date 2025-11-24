package ArraysQuestions.Easy;

//744. find smallest letter greater than target
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

public class LeetCode744 {
    public static void main(String[] args) {

        char[] letters={'c','f','j'};
        char target='b';

        char ans=binary(letters,target);

        System.out.println(ans);

    }


    static char binary(char[] letters,char target)
    {
        int start=0;
        int end=letters.length-1;


        while(start<=end)
        {

            int mid=start+(end-start)/2;
            if(target<letters[mid])
            {
                end=mid-1;
            }

            else
            {
                start=mid+1;
            }


        }
        int ans=start % letters.length;
        return letters[ans];
    }
}
