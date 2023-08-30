package CodingNinja.Recursion.Problems;

public class ReplacePi {

    public static String replacePi(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            String smallOp = replacePi(str.substring(2));
            return "3.14" + smallOp;
        } else {
            String smallOp = replacePi(str.substring(1));
            return str.charAt(0) + smallOp;
        }
    }

    public static void main(String[] args) {
        System.out.println(replacePi("abpijpikkippi"));
    }
}
