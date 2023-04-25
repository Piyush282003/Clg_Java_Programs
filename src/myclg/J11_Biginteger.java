package myclg;

import java.math.BigInteger;
import java.util.Scanner;

public class J11_Biginteger {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int n = sc.nextInt();
//        BigInteger b = new BigInteger("1");
//
//        for (int i=2;i<=n;i++){
//            b=b.multiply(BigInteger.valueOf(i));
//        }
//        System.out.println(b);
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=123456789;
        BigInteger b = BigInteger.valueOf(i);
        System.out.println(b);

        String str="123456789";
        BigInteger c = new BigInteger(str);
        System.out.println(c);

        BigInteger sum = b.add(c);
        System.out.println("The sum is:- "+sum);

        BigInteger d = BigInteger.ONE;
        BigInteger e = BigInteger.TEN;
        System.out.println(d);
        System.out.println(e);

        int x = b.intValue();
        long y = b.longValue();
        String z = b.toString();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if(b.compareTo(c)<0){                        //it means (a<b)
            System.out.println(b);
        }
    }
}
