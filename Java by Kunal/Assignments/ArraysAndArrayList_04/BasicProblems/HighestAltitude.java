package Assignments.ArraysAndArrayList_04.BasicProblems;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,6,0,-7};
        int n = gain.length;
        int max = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            temp = temp + gain[i];
            if (temp > max)
                max = temp;
        }

        System.out.println(max);
    }
}
