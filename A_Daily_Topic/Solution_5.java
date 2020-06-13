package A_Daily_Topic;

import java.util.Stack;

public class Solution_5 {
    /**
     * 合法括号序列判断
     * https://www.nowcoder.com/practice/d8acfa0619814b2d98f12c071aef20d4?tpId=8&&tqId=11039&rp=1&ru=/activity/oj&qru=/ta/cracking-the-coding-interview/question-ranking
     * @param args
     */
    public static void main(String[] args) {
        String s = "()()(((())))";
        System.out.println(chkParenthesis(s,12));
    }
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        if (A == null) {
            return false;
        }
        if (n == 1 && n == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(' || A.charAt(i) == '[' || A.charAt(i) == '{') {
                stack.push(A.charAt(i));
            } else if (A.charAt(i) == ')'){
                if (!stack.isEmpty() && stack.pop() != '(') {
                    return false;
                }
            } else if (A.charAt(i) == ']'){
                if (!stack.isEmpty() && stack.pop() != '[') {
                    return false;
                }

            } else if (A.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.pop() != '{') {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
