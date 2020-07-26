package A_Daily_Topic;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       while (sc.hasNextLine()) {
            String s = sc.nextLine();
            Map<Character,Integer> map = new HashMap<>();

            for (int i = 0; i < c.length(); i++) {
                map.put(c.charAt(i),0);
            }

            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
            }
           for (int i = 0; i < map.size(); i++) {

               System.out.println(c.charAt(i)+":"+map.get(c.charAt(i)));
           }
        }
    }

}