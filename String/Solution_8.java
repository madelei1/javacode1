package String;

public class Solution_8 {
    /**
     * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
     *
     * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
     *
     * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
     *
     * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
     *
     * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
     *
     * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
     *
     * 说明：
     *
     * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        String string = str.trim();//去除字符串前面的空格
        if (string.length() == 0) {
            return 0;
        }
        int i = 0;//符号计算的下一个
        int x = 1;//默认符号位为正数
        if (string.charAt(0) == '+') {
            i = 1;
        } else if (string.charAt(0) == '-') {
            i = 1;
            x = -1;
        }
        int y = 0;
        while (i < string.length() && (string.charAt(i) <='9' && string.charAt(i) >='0')) {
            int n = (string.charAt(i)- '0') * x;//转化为数字
            //判断是否是假设我们的环境只能存储 32 位大小的有符号整数，
            // 那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
            if(y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && n > 7)){
                return Integer.MAX_VALUE;
            }
            if(y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && n < -8)){
                return Integer.MIN_VALUE;
            }
            y = y *10 +n;
            i ++;
        }
        return y;
    }
}