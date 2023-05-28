package CodingNinja.StringAssignment;

public class NumberOfCharOccurance {

    public static void main(String[] args) {
        String s1 = "aabbbaa";
        String sorted = getSortedString(s1);
        char highestCount = findHighestCount(s1, sorted);

        System.out.println(highestCount);
    }

    public static char findHighestCount(String str, String sorted) {
        char answer = ' ';
        int maxCount = 0;
        for (int i = 0; i < sorted.length(); i++) {
            int charCount = 0;
            char ch = sorted.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) charCount++;
            }

            if (charCount > maxCount) {
                maxCount = charCount;
                answer = ch;
            }
        }

        return answer;
    }

    public static String getSortedString(String str) {
        String answer = String.valueOf(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) answer += str.charAt(i);
        }

        if (answer.charAt(answer.length() -1) != str.charAt(str.length() -1 )) answer += str.charAt(str.length() -1 );

        return answer;
    }
}
