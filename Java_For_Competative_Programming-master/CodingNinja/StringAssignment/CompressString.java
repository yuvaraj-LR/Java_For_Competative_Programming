package CodingNinja.StringAssignment;

public class CompressString {
    public static void main(String[] args) {
        String str = "aaaabbbcddeegg";

        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        int count = 1;
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            int letterCount = 0;
            for (int j = i + 1; j < str.length() - 1; j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    letterCount++;
                }
            }
            System.out.println(str.charAt(i) + "" + letterCount);
        }

        return ans;
    }
}
