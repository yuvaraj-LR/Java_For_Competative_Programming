package Assignments.ArraysAndArrayList_04.BasicProblems;

import java.util.Arrays;

public class KidsWithTheGreatestNumberOfCandy {
    public static void main(String[] args) {
        //actualMethod()
        myMethod();
    }

    private static void myMethod() {
        int[] candies = {2, 3, 5, 1, 3};
        boolean[] result = new boolean[candies.length];
        int extraCandies = 1;
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            if (candies[i] >= max)
                 max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            //candies[i] += extraCandies;
            if (candies[i] >= max)
                result[i] = true;
        }
        System.out.println(max);
        System.out.println(Arrays.toString(result));
    }
}
