package myclg;

import java.lang.Math;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class J08_fibonacci_armstrong_prime_char {
    static int fibo(int n){
        if(n<=1) {
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    static boolean vowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return  false;
    }

    static boolean armstrong(int n){
        int cnt=0,ans=0;
        int m=n,i=n;
        while(m!=0){
            cnt++;
            m=m/10;
        }
        while(n!=0){
            ans+=Math.pow(n%10,cnt);
            n=n/10;
        }
        if(ans==i){
            return true;
        }
        return false;
    }

    static void prime(int a,int b){
        for(int i=a;i<=b;i++){
            if(i==0 || i==1){
                continue;
            }
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }

            if(flag){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int ans = fibo(n-1);
//        System.out.println(ans);
//
//        System.out.println("Enter a character");
//        char ch = sc.next().charAt(0);
//        if(vowel(ch)){
//            System.out.println("Yes it is a vowel");
//        }
//        else{
//            System.out.println("It is a constant");
//        }
//
//        int a = sc.nextInt();
//        if (armstrong(a)) {
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }


        int b = sc.nextInt();
        int c = sc.nextInt();
        prime(b,c);
    }
}
