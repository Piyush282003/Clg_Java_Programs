package myclg;

import java.util.Scanner;
import java.lang.Math;

public class J06_decimaltobinary_viceversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int i=0,ans=0;
//        while(n!=0){
//            int digit = n&1;
//            ans += digit*Math.pow(10,i);
//            n=n>>1;
//            i++;
//        }
//        System.out.println(ans);

        int n = sc.nextInt();
        int i=0,ans=0;
        while(n!=0){
            int d = n%10;
            if(d==1){
                ans+=Math.pow(2,i);
            }
            i++;
            n=n/10;
        }
        System.out.println(ans);
    }
}
