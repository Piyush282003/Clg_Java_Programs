package myclg;

import java.util.Scanner;

public class J01_sumofthreenum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans;
        if(a>b && a>c){
            ans=a;
        }
        else if(b>a && b>c){
            ans=b;
        }
        else{
            ans=c;
        }
        boolean flag=false;
        int sum=0;
        while(ans!=0){
            sum+=ans%10;
            ans=ans/10;
        }
        for(int i=2;i<sum;i++){
            if(sum%i==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println(sum + " is not a prime number..");
        }
        else{
            System.out.println("Yes it is a prime number..");
        }
    }
}
