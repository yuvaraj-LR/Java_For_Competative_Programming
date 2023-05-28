package CodingNinja.StringAssignment;

public class RemoveTheDuplicates {
    public static void main(String[] args) {
        String str = "aabbccddaaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }

    public static String removeConsecutiveDuplicates(String str) {

        String answer = str.charAt(0) + "";

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) answer += str.charAt(i);
        }

        if (answer.charAt(answer.length() -1) != str.charAt(str.length() -1 )) answer += str.charAt(str.length() -1 );


        return answer;
    }
}
