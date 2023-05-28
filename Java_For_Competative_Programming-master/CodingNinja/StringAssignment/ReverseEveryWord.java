package CodingNinja.StringAssignment;

public class ReverseEveryWord {
    public static void main(String[] args) {
        String str = "abcj def ghikl";
        reverseEveryWord(str);
    }

    private static void reverseEveryWord(String str) {
        String ans = "";

        int startingIndex = 0;
        int i = 0;
        for ( ;i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int endIndex = i - 1;
                String reversedWord = reverse(str, startingIndex, endIndex);
                ans += reversedWord + " ";
                startingIndex = i + 1;
            }
        }

//        For Last word
        String reversedWord = reverse(str, startingIndex, i-1);
        ans += reversedWord + " ";

        System.out.println(ans);
    }

    private static String reverse(String str, int startingIndex, int endIndex) {

        String reversedWord = "";

        for (int i = endIndex; i >= startingIndex; i--) {
            reversedWord += str.charAt(i);
        }

        return reversedWord;
    }


}
