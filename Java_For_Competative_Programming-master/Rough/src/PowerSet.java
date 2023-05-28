import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(15);
        arr.add(25);

        ArrayList<ArrayList<Integer>> ans = pwset(arr);
        System.out.println(ans);

    }

    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        // WRITE YOUR CODE HERE

        int n = arr.size()-1;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> emptyElement = new ArrayList<>();
        ans.add(emptyElement);

        for (int i = 0; i <= n; i++) {

            ArrayList<Integer> singleElement = new ArrayList<>();
            singleElement.add(arr.get(i));

            for (int j = i; j <= n; j++) {
                if (i != j) {
                    ArrayList<Integer> doubleElement = new ArrayList<>();
                    doubleElement.add(arr.get(i));
                    doubleElement.add(arr.get(j));
                    ans.add(doubleElement);
                }
            }
            ans.add(singleElement);
        }

//        For empty and whole arr
        ans.add(arr);

        return ans;
    }
}
