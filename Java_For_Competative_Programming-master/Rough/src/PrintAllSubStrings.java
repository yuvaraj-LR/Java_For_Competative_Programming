public class PrintAllSubStrings {

    public static void main(String[] args) {
        String str = "abce";
        printAllSubString1(str);
    }

    public static void printAllSubString1(String str) {

        for (int start = 0; start <= str.length() - 1; start++) {
            for (int end = start + 1; end <= str.length(); end++) {
                System.out.print(str.substring(start , end) + " ");
            }
        }
    }
}
