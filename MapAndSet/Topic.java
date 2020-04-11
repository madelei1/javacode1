package MapAndSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Topic {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <10_0000; i++) {
            arrayList.add(random.nextInt(10_0000));
        }
        for (Integer val : arrayList) {
            set.add(val);
        }
        System.out.println(set);
        /*for (Integer val : arrayList) {
            if (set.contains(random)) {
                System.out.println(random);
                return;
            }
            set.add(val);
        }*/

    }
    
}
