package Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test5 {
    public static void main(String[] args) {
        //BigDecimal这个是浮点数的大数值，和用法BigInteger一样
        //int 最大范围为20亿
        int a = 20_0000_0000;
        int b = 20_0000_0000;

        BigInteger bigInteger = BigInteger.valueOf(a);
        System.out.println(bigInteger);
        BigInteger c = bigInteger.add(bigInteger);
        System.out.println(c);
        BigInteger bigInteger1 = null;
        for (int i = 0; i < 10; i++) {
            if (bigInteger1 == null ) {
                //c*bigInteger1 -- multiply表示相乘
                bigInteger1 = c.multiply(bigInteger);
            } else {
                bigInteger1 = c.multiply(bigInteger1);
            }

        }


        System.out.println(bigInteger1);
    }
}
