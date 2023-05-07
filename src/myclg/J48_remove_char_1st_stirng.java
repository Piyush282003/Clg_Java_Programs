package myclg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J48_remove_char_1st_stirng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for(int i=0;i< s2.length();i++){
            l2.add(s2.charAt(i));
        }
        for(int i=0;i< s1.length();i++){
            if(!l2.contains(s1.charAt(i))){
                l1.add(s1.charAt(i));
            }
        }
        System.out.println(l1.toString());

    }
}
