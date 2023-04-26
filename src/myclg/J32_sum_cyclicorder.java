package myclg;

import java.util.Scanner;

public class J32_sum_cyclicorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nunmber:-");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }

        int sum=0;
        while(rev!=0){
            int m=rev;
            while(m!=0){
                sum+=m%10;
                m=m/10;
            }
            rev=rev/10;
        }
        System.out.println("The sum of digits in cycliuc order is "+sum);
    }
}
