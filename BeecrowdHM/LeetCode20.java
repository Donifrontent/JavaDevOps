import java.util.Stack;

public class LeetCode20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        LeetCode20 solution = new LeetCode20();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";

        System.out.println(solution.isValid(s1));
        System.out.println(solution.isValid(s2));
        System.out.println(solution.isValid(s3));
        System.out.println(solution.isValid(s4));
    }
}