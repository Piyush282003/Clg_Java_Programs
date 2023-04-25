package myclg;

import java.util.Scanner;
import java.lang.Math;

public class J09_add2bigintegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of a");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("For a");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Size of b");
        int m=sc.nextInt();
        int [] b = new int[m];

        System.out.println("For b");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int i=a.length-1,j=b.length-1,k=Math.max(n,m);
        int [] sum = new int[k];
        int carry=0;
        k-=1;
        while(i>=0 && j>=0){
            int d = a[i]+b[j]+carry;
            sum[k]+=d%10;
            carry=d/10;
            i--;j--;k--;
        }
        while(i>=0){
            int d = a[i]+carry;
            sum[k]+=d%10;
            carry=d/10;
            i--;k--;
        }
        while(j>=0){
            int d = b[j]+carry;
            sum[k]+=d%10;
            carry=d/10;
            j--;k--;
        }
        for(int x=0;x<sum.length;x++){
            System.out.print(sum[x]);
        }
    }
}
