package myclg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J46_remove_all_dup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        System.out.println(st.toString());
        for(Character c:st){
            System.out.print("The string after removing duplicates is "+c);
        }

    }
}
