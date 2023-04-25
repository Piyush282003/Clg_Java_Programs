package myclg;

import java.util.Scanner;

public class J17_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        if(n%2!=0 || n==0){
            System.out.println("Error hai bhai");
        }
        else{
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int m=n/2;
            for(int i=0;i<m-1;i++){
                for(int j=i+1;j<m;j++){
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            for(int i=m;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]<a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]);
            }

        }
    }
}
