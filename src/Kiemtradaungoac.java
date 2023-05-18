

import java.util.Stack;

public class Kiemtradaungoac {
    public static boolean checkBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if ((left == '(' && c != ')') || (left == '[' && c != ']') || (left == '{' && c != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "s * (s – a) * (s – b) * (s – c)";
        String s2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String s3 = "s * (s – a) * (s – b * (s – c)";
        String s4 = "s * (s – a) * s – b) * (s – c)";
        String s5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(checkBrackets(s1)); // Kết quả: true
        System.out.println(checkBrackets(s2)); // Kết quả: true
        System.out.println(checkBrackets(s3)); // Kết quả: false
        System.out.println(checkBrackets(s4)); // Kết quả: false
        System.out.println(checkBrackets(s5)); // Kết quả: true
    }
}
