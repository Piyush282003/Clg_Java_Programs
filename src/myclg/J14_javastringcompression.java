package myclg;

import java.util.Scanner;

public class J14_javastringcompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char c=s.charAt(0);
        int cnt=1;
        System.out.println(s.length());
        for(int i=1;i<s.length();i++){
            if(c==s.charAt(i)){
                cnt++;
            }
            else{
                System.out.print(c);
                System.out.print(cnt);
                c=s.charAt(i);
                cnt=1;
            }
        }
//        yeh isliye coz last wale char ka vo if wala hi chlega else wla chlega hi nhi..
        System.out.print(c);
        System.out.print(cnt);
    }
}
