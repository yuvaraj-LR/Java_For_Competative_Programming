import java.util.ArrayList;

public class ClosestDivisior {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(10));
    }

    public static ArrayList<Integer> nextGreaterElement(int num)
    {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=(int) (Math.sqrt(num+2)); i>=1; i--) {
            if ((num+2)%i == 0) {
                ans.set(0, i);
                ans.set(1, (num+2)/i);
                break;
            }

            if ((num+1)%i == 0) {
                ans.set(0, i);
                ans.set(1, (num+1)/i);
                break;
            }
        }

        return ans;
    }
}
