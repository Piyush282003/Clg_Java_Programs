package myclg;

import java.util.Scanner;

class Data{
    int getdata(int a){
        return a;
    }
    void logic(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        display(sum);
    }
    void display(int sum){
        System.out.println("The sum of all even numbers is "+sum);
    }
}
public class J15_addevendigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data d = new Data();
        int a = d.getdata(sc.nextInt());
        d.logic(a);
    }
}
