package myclg;

import java.util.Scanner;

public class J20_sumofascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char [] arr = new char[n+1];
        System.out.println("Enter the ele of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += (int)(arr[i]);
        }
        int rev=0,m=sum;
        while(m!=0){
            rev=rev*10+m%10;
            m=m/10;
        }
        System.out.println(sum);
        System.out.println(rev);
        if(rev==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
