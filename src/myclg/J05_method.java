package myclg;

import java.util.Scanner;

public class J05_method {
    static int getdata(int a){
        return a;
    }
    static long power(int a,int b,int c){
        long mul=1;
        for(int i=0;i<b;i++){
            mul=mul*a;
        }
        a=(int)mul;
        System.out.println(mul);
        for(int i=0;i<c-1;i++){
            mul=mul*a;
        }
        System.out.println(mul);
        return mul;
    }
    static void display(long ans){
        System.out.println("The power of a raise to power b and whole to c is "+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = getdata(sc.nextInt());
        int b = getdata(sc.nextInt());
        int c = getdata(sc.nextInt());
        long ans = power(a,b,c);

        display(ans);
    }
}
