package myclg;

import java.util.Scanner;

public class J02_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }

        System.out.println("Enter an integer or a float number");
        int a=sc.nextInt();
        float b=sc.nextFloat();
        System.out.println(a);
        System.out.println(b);
        char ch = sc.next().charAt(0);
        System.out.println(ch);
    }
}
