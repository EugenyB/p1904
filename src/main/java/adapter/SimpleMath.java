package adapter;

import java.math.BigInteger;

public class SimpleMath {

    // BigInteger

    public static long gcd(long a, long b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    }
}
