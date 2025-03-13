import java.util.Stack;

public class BalancedParenthesesChecker {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                // Check if it matches the correct pair
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Sample test cases
        String input1 = "{[()]}";
        String input2 = "([)]";
        String input3 = "((()))[]{}";
        String input4 = "(()";

        System.out.println(input1 + " -> " + isBalanced(input1)); 
        System.out.println(input2 + " -> " + isBalanced(input2)); 
        System.out.println(input3 + " -> " + isBalanced(input3)); 
        System.out.println(input4 + " -> " + isBalanced(input4)); 
    }
}
