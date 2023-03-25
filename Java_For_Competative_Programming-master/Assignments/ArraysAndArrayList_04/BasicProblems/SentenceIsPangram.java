package Assignments.ArraysAndArrayList_04.BasicProblems;

public class SentenceIsPangram {
    public static void main(String[] args) {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                            "u", "v", "w", "x", "y", "z"};
        boolean condition = false;

        for (int i = 0; i < alpha.length; i++) {
            if (!input.contains(alpha[i])) condition = false;
        }
        condition = true;

        System.out.println(condition);
    }
}
