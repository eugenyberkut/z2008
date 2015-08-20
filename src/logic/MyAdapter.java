package logic;

import java.math.BigInteger;

/**
 * Created by eugen on 20.08.2015.
 */
public class MyAdapter {
    public int gcd(int a, int b) {
        BigInteger ba = BigInteger.valueOf(a);
        BigInteger bb = BigInteger.valueOf(b);
        BigInteger gcd = ba.gcd(bb);
        return gcd.intValue();
    }
}
