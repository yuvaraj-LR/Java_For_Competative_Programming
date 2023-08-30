package CodingNinja.Recursion.Problems;

public class KeyPadCode {

    public static String findOptions(int num) {
        if (num == 2) {
            return "abc";
        } else if (num == 3) {
            return "def";
        } else if (num == 4) {
            return "ghi";
        } else if (num == 5) {
            return "jkl";
        } else if (num == 6) {
            return "mno";
        } else if (num == 7) {
            return "pqrs";
        } else if (num == 8) {
            return "tuv";
        } else if (num == 9) {
            return "wxyz";
        }
        return "";
    }

    public static String[] keyPadCode(int num) {

        if (num == 0) {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }

        String[] smallOutput = keyPadCode(num / 10);
        int lastDigit = num % 10;

        String lastDigitOptions = findOptions(lastDigit);
        String[] output = new String[smallOutput.length * lastDigitOptions.length()];

        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            for (int j = 0; j < lastDigitOptions.length(); j++) {
                output[k++] = smallOutput[i] + lastDigitOptions.charAt(j);
            }
        }

        return output;
    }


    public static void main(String[] args) {
        int num = 23;
        String[] ans = keyPadCode(num);

        for(String s : ans) {
            System.out.print(s + " ");
        }

    }
}
