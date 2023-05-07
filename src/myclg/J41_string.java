package myclg;

import java.util.Scanner;

public class J41_string{
public static void main(String[]args){
/*
import java.lang.String;                     -->immutable class
import java.lang.StringBuffer;                 --> mutable class and synchronized
import java.lang.StringBuilder;                 --> mutable class and not synchronized


-if you try to change the object of string class, every time a new object will be considered

String s1="Java";                      -->stored into string pool memory and yeh compile-time pr memory allocate hogi..
String s2="Java";

String s3= new String("Java");                      -->stored into heap memory and yeh run-time pr memory allocate hogi..
String s4= new String("Java");

s1==s3 hai but s2==s4 nhi hai coz yeh dono alag objects hai



String s="abc";
s="123def";                           -->hum change nhi kr skte coz it is an immutable class

string is immutable but stringbuffer is mutable
stringbuffer is not synchronized but string is....
*/

    String s="Hllo";
    String s2="Hllo";
    String s3=new String("Hllo");
    String s4=new String("Hllo");
    String s5 = s3;
    System.out.println(s5==s3);                         //-->true

    System.out.println(s==s2);                        //-->true
    System.out.println(s3==s4);                        //-->false
    System.out.println(s==s3);                         //-->false hoga
    System.out.println(s==s3 ? "The string is same" : "Not same");                         //-->not same coz yeh reference check krega
    System.out.println(s.equals(s3) ? "The string is same" : "Not same");                  //-->yeh same dega coz yeh sirf data ko compare krega not reference...so preferable



/*String class inbuilt methods:-
                -length()
                -charAt(int position)
                -indexOf(ch)
                -lastIndexOf(ch)
                -toUpperCase()
                -toLowerCase()
*/

    char ch[]= {'a','m','a','n'};
    String s6=new String(ch);
    System.out.println(s6);



    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st string ");
    String a=sc.next();
    sc.nextLine();                                   //-->agr yeh nhi lagayenge toh b me input nhi le paayega
    System.out.println("Enter the 2nd string ");
    String b=sc.nextLine();
    System.out.println("String 1 is "+a);
    System.out.println("String 2 is "+b);
}
}
