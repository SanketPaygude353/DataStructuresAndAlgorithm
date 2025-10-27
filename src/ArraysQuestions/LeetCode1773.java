package ArraysQuestions;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//1773.Count items matching a rule
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//Output: 1
//Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
public class LeetCode1773 {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index=0;
        int i=0;
        if(ruleKey.equals("type"))
            index=0;
        if(ruleKey.equals("color"))
            index=1;
        if(ruleKey.equals("name"))
            index=2;

        for(List<String>item : items)
        {
            if(item.get(index).equals(ruleValue))
            {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        // Call the function
        int result = countMatches(items, ruleKey, ruleValue);

        // Print output
        System.out.println("Number of items matching the rule: " + result);

    }
}
