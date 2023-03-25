package Assignments.ArraysAndArrayList_04.BasicProblems;

public class MaxPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999}, {2001, 2010}, {1992, 2000}};
        int[] arr = new int[2051];

        int maxYear = 1950;
        int count = 0;

        for(int i = 0; i < logs.length; i++){

            arr[logs[i][0]]++;
            arr[logs[i][1]]--;
        }

        //take comulutive sum of array
        for(int i = 1950; i < 2051; i++){
            arr[i] = arr[i] + arr[i-1];
        }

        //Constraint => 1950 <= birthi < deathi <= 2050
        //find maximum count with earliest year
        for(int i = 1950; i < 2051; i++){
            if(arr[i] > count){
                count = arr[i];
                maxYear = i;
            }
        }

        System.out.println(maxYear);

    }
}
