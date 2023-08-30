package CodingNinja.Maps.Questions;

public class NumberOfPairs {

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 4};
        int numOfPairs = getPairsWithDifferenceK(arr, 0);

        System.out.println("Number of Pairs " + numOfPairs);
    }



    public static int getPairsWithDifferenceK(int arr[], int k) {
        //Write your code here

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
