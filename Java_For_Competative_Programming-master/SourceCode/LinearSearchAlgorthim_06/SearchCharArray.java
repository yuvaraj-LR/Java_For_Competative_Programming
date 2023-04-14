package SourceCode.LinearSearchAlgorthim_06;

public class SearchCharArray {
    public static void main(String[] args) {
        String word = "Computer Science";
        char target = 'z';
        System.out.println(searchChar2(word.toLowerCase(), target));
    }


    //Searching the target in word, If founded return the index of that item.
    //Otherwise, return -1
    static boolean searchChar(String str, char tar){
        if (str.length()==0)
            return false;

        for (int ch = 0; ch < str.length(); ch++) {
            if (tar == str.charAt(ch))
                return true;
        }
        return false;
    }

    //Searching the target in word, If founded return the index of that item.
    //Otherwise, return -1
    static boolean searchChar2(String str, char tar){
        if (str.length()==0)
            return false;

        for (int ch : str.toCharArray()) {
            if (ch == tar) {
                return true;
            }
        }
        return false;
    }
}
