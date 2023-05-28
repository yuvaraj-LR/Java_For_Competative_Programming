package CodingNinja.Test3;

public class MinLengthWord {

    public static void main(String[] args) {
        String str = "abc de ghihjk";
        System.out.println(minLengthWord(str));
    }

    public static String minLengthWord(String input){

        int count = Integer.MAX_VALUE;
        int currentIndex = 0;
        int startIndex = 0;

        String ans = "";

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == ' ') {
                currentIndex = i - 1;
                int charCount = findCount(input, startIndex, currentIndex);

                if (charCount < count) {
                    count = charCount;
                    ans = printString(input, startIndex, currentIndex);
                }

                startIndex = i + 1;
            }
        }


        int lastWord = findCount(input, startIndex, input.length() - 1);

        if (lastWord < count)  ans = printString(input, startIndex, input.length() - 1);


        return ans;

    }

    public static int findCount (String str, int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            count++;
        }

        return count;
    }

    public static String printString (String input, int start, int end) {
        String str = "";

        for (int i = start; i <= end; i++) {
            str += input.charAt(i) + "";
        }

        return str;
    }
}
