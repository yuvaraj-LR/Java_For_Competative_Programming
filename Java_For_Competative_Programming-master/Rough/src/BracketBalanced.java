import java.util.Stack;

public class BracketBalanced {

    public static void main(String[] args) {
        String str = "(){(";
        System.out.println(str.length());
        boolean isTrue = isBalanced(str);
        System.out.println(isTrue);
    }

    public static boolean isBalanced(String str) {
        //Your code goes here

        boolean isMatch = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currentchar = str.charAt(i);

            if( currentchar == '{' || currentchar == '[' || currentchar == '(' ) {
                stack.push(currentchar);
            }

            if (stack.isEmpty()) {
                return false;
            }

            char currentTop = stack.peek();

            if ( currentchar == '}' || currentchar == ']' || currentchar == ')') {
                stack.push(currentchar);

                char currentLast = stack.pop();

                if( currentTop == '{' && currentLast == '}' ) {
                    isMatch = true;
                } else if ( currentTop == '['  && currentLast == ']' ) {
                    isMatch = true;
                } else if ( currentTop == '(' && currentLast == ')' ) {
                    isMatch = true;
                } else {
                    return false;
                }
                stack.pop();
            }
        }

        return isMatch;
    }
}


