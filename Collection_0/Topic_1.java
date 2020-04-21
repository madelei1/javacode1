package Collection_0;

import java.util.ArrayList;
import java.util.List;

public class Topic_1 {
    /**
     * 字符串str1，str2，删除str1中的str2
     * @param args
     */
    public static void main1(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "welcome";
        String[] strings = str1.split(" ");
        String[] strings1 = str2.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }
        for (int i = 0; i < strings1.length; i++) {
            if (list.contains(strings1[i])) {
                list.remove(strings1[i]);
            }
        }
        System.out.println(list);
    }

    /**
     * 删除第一个字符串中出现的第二个字符串的字符
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        char[] s = str1.toCharArray();
        //char[] x = str2.toCharArray();
        List<Character> list = new ArrayList<>();
        //List<Character> list1 = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (list.get(i).equals(str2.charAt(j))) {
                    list.remove(list.get(i));
                }
            }
        }
        String ret = "";
        for (int i = 0; i < list.size(); i++) {
            ret += list.get(i);
        }
        System.out.println(ret);
    }
}
