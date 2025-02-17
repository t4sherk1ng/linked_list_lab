public class BracketsValidator {
    private static boolean isOpenBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean isCloseBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    private static boolean isMatchingPair(char open, char close) { //проверяет пары
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}