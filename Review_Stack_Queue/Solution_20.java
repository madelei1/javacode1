package Review_Stack_Queue;

import java.util.Stack;

public class Solution_20 {
    /**
     * 题目：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] string = s.toCharArray();
        for(int i = 0; i < string.length; i++) {
            if(string[i] == '{'|| string[i] == '[' || string[i] == '(') {
                stack.push(string[i]);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    if(string[i] == '}') {
                        char c = stack.pop();
                        if(c != '{') {
                            return false;
                        }
                    } else if(string[i] == ']') {
                        char c = stack.pop();
                        if(c != '[') {
                            return false;
                        }
                    } else if(string[i] == ')'){
                        char c = stack.pop();
                        if(c != '(') {
                            return false;
                        }
                    }
                }
            }
        }
        if(! stack.isEmpty()) {
            return false;
        }
        return true;
    }

}