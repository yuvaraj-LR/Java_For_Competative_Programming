package SourceCode.SearchAlgorthim_06.BinarySearch.BinarySearch.BinarySearchByPrblms;

public class SmallesLetter {
    public static void main(String[] args) {
        char[] str = { 'c', 'f', 'j', 'y'};
        char target = 'a';
        char ans = smallestLetter(str, target);
        System.out.println(ans);
    }

    static char smallestLetter(char[] str, char target) {
        if (str.length == 0) return ' ';

        int start = 0;
        int end = str.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < str[mid]) end = mid - 1;
            else start = mid + 1;

        }
        return str[start % str.length];
    }
}
