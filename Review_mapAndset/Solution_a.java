package Review_mapAndset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution_a {
    /**
     * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。
     * 现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
     * 肯定坏掉的那些键。
     * 输入在2行中分别给出应该输入的文字、以及实际被输入的文字。
     * 每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
     * 以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        String s1 = sc.nextLine();
        s1 = s1.toUpperCase();
        String x;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }
        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i)) && !set1.contains(s.charAt(i))) {
                set1.add(s.charAt(i));
                System.out.print(s.charAt(i));
            }
        }

    }



}
