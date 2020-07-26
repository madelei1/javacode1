package A_Daily_Topic;

import java.util.Scanner;

public class Solution_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while (sc.hasNextLine()) {
            String s = sc.nextLine();
            //String s = "oxA";
            int r = 0;
            if (s.length() <= 1) {
                return;
            }
            for (int i = s.length()-1; i > 1; i--) {
                if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
                    int c = s.charAt(i) - 48;
                    int x = (int)Math.pow(16,s.length()-i-1);
                    r += c*x;
                } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'F') {
                    int c = s.charAt(i) - 55;
                    int x = (int)Math.pow(16,s.length()-i-1);
                    r += c*x;
                }
            }
            System.out.println(r);
        }

    //}
}
