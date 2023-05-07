package myclg;

import java.net.Inet4Address;
import java.util.*;

public class J45_max_occuring_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
//            s[i]ko java me s.charAt(i) likhte hai..
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(m);
        int max=0;
        char ans = ' ';                    //sbko initialize toh krna hi pdega bhai..

//        for(Integer i:m.values()){
//            if(max<i){
//                max=i;
//            }
//        }
        for(Map.Entry<Character,Integer> e:m.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
                ans=e.getKey();
            }
        }
        System.out.println(max);
        System.out.println("The max occuring character is "+ans);

    }
}
