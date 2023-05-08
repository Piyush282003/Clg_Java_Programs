package myclg;

import java.util.Scanner;

public class J49_upper_lower_Case {
    public static void main(String[] args) {
//        String s="abcdef";
//        String x="";
//        for(int i=0;i<s.length();i++){
////            if(Character.isLowerCase(s.charAt(i))){
//            if(i%2==0){
//                x+=Character.toUpperCase(s.charAt(i));
//            }
//            else{
//                x+=s.charAt(i);
//            }
//        }
//        System.out.println(x);


        Scanner obj = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s1 = obj.nextLine();

        char[] chArr = s1.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            if (i % 2 != 0) {
                chArr[i] = Character.toUpperCase(chArr[i]);
            } else {
                chArr[i] = Character.toLowerCase(chArr[i]);
            }
        }

        String s2 = new String(chArr);

        System.out.println("New String = " + s2);
    }
}
