package myclg;

import java.util.Scanner;

public class J07_sumofsq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumsq=0,sumcub=0;
        for(int i=1;i<=n;i++){
            sumsq+=i*i;
            sumcub+=i*i*i;
        }
        System.out.println(sumsq);
        System.out.println(sumcub);
    }
}
