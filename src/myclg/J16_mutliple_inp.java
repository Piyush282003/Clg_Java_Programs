package myclg;

import java.util.Scanner;

public class J16_mutliple_inp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=0,ne=0,zero=0;
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n>0){
                ++p;
            }
            else if(n<0){
                ++ne;
            }
            else if(n==0){
                ++zero;
            }
        }
        System.out.println("The positive number is "+p);
        System.out.println("The negative number is "+ne);
        System.out.println("The number of zero is "+zero);
    }
}
