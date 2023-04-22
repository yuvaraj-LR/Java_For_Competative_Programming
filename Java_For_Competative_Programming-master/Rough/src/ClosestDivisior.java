import java.util.ArrayList;

public class ClosestDivisior {
    public static void main(String[] args) {
        System.out.println(getElements(11));
    }

    static ArrayList<Integer> getElements(int num) {
        ArrayList<Integer> answerArray = new ArrayList<>(2);
        // For the first Number.
        for (int i = 1; i <= num/2; i++) {
            int difference = 0;

            // For the second Number.
            for (int j = 1; j <= num/2; j++) {
                if (i * j == num) {
                    if (j - i > difference) {
                        difference = j - i;
                        answerArray.add(i);
                        answerArray.add(j);
                    }
                }
            }
        }

        return answerArray;
    }
}
