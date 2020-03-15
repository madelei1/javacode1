package Stack;

import java.util.Stack;

public class Topic {
    /**
     * 20题
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char xi;
        for (int i = 0; i < s.length(); i++) {
            //如果是左括号入栈
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                //右括号
                if (stack.empty()) {
                    System.out.println("右括号多！");
                    return false;
                } else {
                    //拿到栈顶元素进行比较 看是否匹配  匹配出栈
                    if (s.charAt(i) == ')') {
                        xi = stack.pop();
                        if (xi != '(') {
                            return false;
                        }
                    } else if (s.charAt(i) == ']') {
                        xi = stack.pop();
                        if (xi != '[') {
                            return false;
                        }
                    } else if (s.charAt(i) == '}') {
                        xi = stack.pop();
                        if (xi != '{') {
                            return false;
                        }
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }else {
            return true;
        }
    }
}