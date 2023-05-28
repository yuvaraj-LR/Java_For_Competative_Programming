import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindDifferenceInArray {

    public static void main(String[] args) {

        int[] arr1 = {1,1,2,2};
        int[] arr2 = {1,2,3,4};

        ArrayList<Integer> tupleArray1 = (ArrayList<Integer>) makeTuple(arr1);
        ArrayList<Integer> tupleArray2 = (ArrayList<Integer>) makeTuple(arr2);

        ArrayList[] ans = new ArrayList[]{tupleArray1, tupleArray2};

        for (int i = 0; i <= tupleArray1.size(); i++) {
            for (Integer integer : tupleArray2)
                if (Objects.equals(tupleArray1.get(i), integer)) {
                    tupleArray1.remove(i);
                }
        }

        for (int i = 0; i < tupleArray2.size(); i++) {
            for (int j = 0; j < tupleArray1.size(); j++) {
                if (tupleArray2.get(i).equals(tupleArray1.get(j))) {
                    tupleArray2.remove(i);
                }
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    public static List<Integer> makeTuple(int[] num) {
        List<Integer> newList = new ArrayList<>();
        for (int element : num) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
}
