package CodingNinja.StringAssignment;

public class ReverseStringWordWise {

    public static void main(String[] args) {
        String str = "Hello there! This is Yuvaraj.";
        System.out.println(reverseWordWise(str));
    }

    public static String reverseWordWise(String str) {
        // Write your code here

        String ans = "";
        int startIndex = 0;
        int endIndex = str.length() - 1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                startIndex = i + 1;
                ans += str.substring (startIndex, endIndex + 1) + " ";
                endIndex = i - 1;
            }
        }

        startIndex = 0;
        ans += str.substring (startIndex, endIndex + 1) + " ";

        return ans;
    }

}
