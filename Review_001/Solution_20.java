package Review_001;

import java.util.Stack;

public class Solution_20 {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() == true || stack.pop() != '(') {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty() == true || stack.pop() != '{') {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() == true || stack.pop() != '[') {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;

    }
}
