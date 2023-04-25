package myclg;

import java.util.Scanner;

public class J18_insertintospecificpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n+1];
        System.out.println("Enter the ele of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index where you want to insert");
        int k = sc.nextInt();
        System.out.println("Enter the ele which you want to insert");
        int ele=sc.nextInt();
        for(int i=n;i>k;i--){
            arr[i]=arr[i-1];
        }
        arr[k]=ele;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
