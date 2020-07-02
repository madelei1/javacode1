package Review_001.Map_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution_a {

    /**
     * 旧键盘上坏了几个键，于是在敲一段文字的时候，
     * 对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
     * 肯定坏掉的那些键。
     * 链接：https://www.nowcoder.com/questionTerminal/f88dafac00c8431fa363cd85a37c2d5e
     * 来源：牛客网
     *
     * 输入描述:
     * 输入在2行中分别给出应该输入的文字、以及实际被输入的文字。
     * 每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
     * 以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
     * 输出描述:
     * 按照发现顺序，在一行中输出坏掉的键。
     * 其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
     * @param args
     */
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();*/
        String s = "faengebhe4brhbrrkbhakbnrkbhrbhrkbhr";
        String s1 = "fng4n";
        s = s.toUpperCase();
        s1 = s1.toUpperCase();
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                if (!set1.contains(s.charAt(i))) {
                    set1.add(s.charAt(i));
                    System.out.print(s.charAt(i));
                }
            }
        }


    }
}
