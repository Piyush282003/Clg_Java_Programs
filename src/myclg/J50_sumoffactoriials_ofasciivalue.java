package myclg;

import java.math.BigInteger;

public class J50_sumoffactoriials_ofasciivalue {
    public static void main(String[] args) {
        String s="aBc";
        BigInteger sum = new BigInteger("0");                            //isse initialize bhi krna hoga yrr
//        OR
//        BigInteger sum=null;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            BigInteger b=BigInteger.ONE;

            for(int j=2;j<c;j++){
                b=b.multiply(BigInteger.valueOf(j));
            }
            sum=b.add(BigInteger.ZERO);
        }
        System.out.println(sum);
    }
}
