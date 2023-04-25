package myclg;

import java.util.Scanner;

public class J19_sumofallprimeinarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n+1];
        System.out.println("Enter the ele of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int e=arr[i];
            boolean prime = true;
            for(int j=2;j<e;j++){
                if(e%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime && e!=1){
                sum+=e;
            }
        }
        System.out.println("Sum of all prime num is "+sum);
        if(sum%2==0){
            System.out.println("Sum is even");
        }
        else{
            System.out.println("Sum is odd");
        }

    }
}
