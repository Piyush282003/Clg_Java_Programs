package myclg;

import java.math.BigInteger;
import java.util.Scanner;

public class J31_primeusingBigInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

//        BigInteger b = new BigInteger("n");                             //->error coz of NumberFormatException
        BigInteger b = BigInteger.valueOf(n);
        boolean f = b.isProbablePrime(1);
//        boolean f = b.isProbablePrime(0);
//        boolean f = b.isProbablePrime(-1);
        System.out.println(f);
        if(f){
            System.out.println("Prime h bhai");
        }
        else{
            System.out.println("Not prime bhai");
        }
    }
}
