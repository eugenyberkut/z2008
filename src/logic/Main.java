package logic;

import prototype.First;

import java.math.BigInteger;

/**
 * Created by eugen on 20.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
//        BigInteger a = BigInteger.valueOf(1001);
//        BigInteger b = BigInteger.valueOf(65);
//        BigInteger gcd = a.gcd(b);
//        System.out.println(gcd);
        int nod = new MyAdapter().gcd(1001, 65);
        System.out.println("nod = " + nod);

        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println("f = " + f);

        System.out.println("-----------------------------");
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);

        a = a + 30;
        b = b + 30;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);

        First z = new First(3,1.4);
        try {
            First q = (First) z.clone();
            q.setX(5);
            System.out.println(z);
            System.out.println(q);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
