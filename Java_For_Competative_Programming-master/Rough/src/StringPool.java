public class StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        String str3 = new String("abc");

        String str4 = "hfhfh";

        if (str1 == str3) {
            System.out.println(true);
        }
    }
}
