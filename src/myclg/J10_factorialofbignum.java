package myclg;

import java.util.Scanner;

public class J10_factorialofbignum {
    static int multiply(int x,int res[],int ressize){
        int carry=0;
        for(int i=0;i<ressize;i++){
            int prod=res[i]*x+carry;
            res[i]=prod%10;
            carry=prod/10;
        }
        while(carry!=0){
            res[ressize]=carry%10;
            carry=carry/10;
            ressize++;
        }
        return ressize;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int [] res = new int[500];                //ye 500 ya usse zada ka hi bnao
        int ressize=1;
        res[0]=1;
        for(int i=2;i<=n;i++){
            ressize=multiply(i,res,ressize);
        }

        for(int j=ressize-1;j>=0;j--){
            System.out.print(res[j]);
        }
    }
}
