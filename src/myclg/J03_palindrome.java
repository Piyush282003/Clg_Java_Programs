package myclg;

import java.util.Scanner;

public class J03_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int rev=0,n=a;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if(rev==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("Not");
        }
    }
}
