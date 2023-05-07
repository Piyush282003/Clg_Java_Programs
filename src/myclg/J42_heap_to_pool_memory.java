package myclg;

import java.util.Locale;

public class J42_heap_to_pool_memory {
    public static void main(String[] args) {
        String str1="java";
        String str2=new String("java");
        String str3=str2;

        System.out.println(str1==str2);             //-->false
        System.out.println(str2==str3);             //-->true
        System.out.println(str1==str3);              //-->false


        String str4=str2.intern();                                           //-->convert heap to pool memory
        System.out.println(str1==str2);             //-->false
        System.out.println(str2==str4);             //-->false
        System.out.println(str1==str4);              //-->true



//        str1.replace('a','z');                                -->yeh change nghi krega str1 me
        String c = str1.replace('a','z');
        System.out.println("Name after changing is "+c);
        System.out.println(str1.toUpperCase());
    }
}
