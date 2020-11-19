package lesson12;

import lesson05.inheritance.B;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

public class HalloBigNumber {
    public static void main(String[] args) {
        BigInteger integer = new BigInteger("555555555555");
        System.out.println(integer);
        BigInteger integer1 = new BigInteger("101",2);
        BigInteger integer2 = new BigInteger("1111111111");
        System.out.println(integer1);
        System.out.println(integer.add(integer2));
        System.out.println(integer.add(BigInteger.valueOf(532453465234L)));

        // 1111_1111, 1111_0000  (0-255) (128+64) -> (255)
        // 128, 64, 32, 16, 8, 4, 2, 1 (0)
        // 7,6,5,4,3,2,1,0  два в степени индекса двоичного значения (radix)
        // 111 = 7

        BigDecimal bigDecimal = new BigDecimal(3.14);
        System.out.println(bigDecimal.setScale(1, RoundingMode.CEILING));
       // System.out.println(bigDecimal.setScale(4, RoundingMode.HALF_DOWN));

        ArrayList<Number> list = new ArrayList<>();
        list.add(12);
        list.add(12.5);
        list.add(bigDecimal);
        list.add(integer);
        Fraction fraction = new Fraction(2,3);
        list.add(fraction);
        System.out.println(list);
    }
}
