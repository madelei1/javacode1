package MapAndSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution_a {
    /**
     * 题目：
     * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。
     * 现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
     * 肯定坏掉的那些键。
     * 链接：https://www.nowcoder.com/questionTerminal/f88dafac00c8431fa363cd85a37c2d5e
     * 来源：牛客网
     *
     * 输入描述:
     * 输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
     * 以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
     *
     *
     * 输出描述:
     * 按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
     * 思路：将结果放入set中，遍历第一遍，看是否在set中，如果没有就打印，注意：结果设定是一行，且是大写的
     */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String string = sc.nextLine();//第一遍输入想要的字符串
        String string1 = sc.nextLine();//打印出的字符串
       /* String string = "abcdefg";
        String string1 = "abeg";*/
        string = string.toUpperCase();//将字符串转化为大写
        string1 = string1.toUpperCase();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < string1.length(); i++) {
            set.add(string1.charAt(i));
        }
        Set<Character> set1 = new HashSet<>();
        for (int j = 0; j < string.length(); j++) {
            //! set1.contains(string.charAt(j))防止输出字符串重复
            if (! set.contains(string.charAt(j)) && ! set1.contains(string.charAt(j))) {
                set1.add(string.charAt(j));
                System.out.print(string.charAt(j));
            }
        }
    }
}
