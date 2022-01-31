package faberge;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Faberge {

    static class Parameter{
        BigInteger n;
        BigInteger m;

        public Parameter(BigInteger n, BigInteger m) {
            this.n = n;
            this.m = m;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Parameter parameter = (Parameter) o;
            return Objects.equals(n, parameter.n) && Objects.equals(m, parameter.m);
        }

        @Override
        public int hashCode() {
            int hash = 17;
            hash = hash * 31 + n.hashCode();
            hash = hash * 31 + m.hashCode();
            return hash;
        }
    }


    static boolean res = false;
    static long number = 0;
    static Map<Parameter, BigInteger> list = new HashMap<>();

    public static BigInteger height(BigInteger n, BigInteger m) {
        if (!res){
            System.out.println(n + " " + m);
            res = true;
        }
        if(!list.containsKey(new Parameter(n,m))){
            BigInteger result;
            if (n.equals(BigInteger.ZERO) || m.equals(BigInteger.ZERO)) return BigInteger.ZERO;
//            if (n.equals(BigInteger.TWO)) {
//                BigInteger sq = m.multiply(m);
//                return (sq.add(m)).divide(BigInteger.TWO);
//            }
            if (m.compareTo(n) < 0) return height(m, m);
            result =  height(n, m.subtract(BigInteger.ONE)).add(height(n.subtract(BigInteger.ONE),
                    m.subtract(BigInteger.ONE))).add(BigInteger.ONE);
            list.put(new Parameter(n,m), result);
            return result;
        }

        return list.get(new Parameter(n,m));
    }

    public static long getNumber() {
        return number;
    }

    public static void setNumber(long number) {
        Faberge.number = number;
    }
}