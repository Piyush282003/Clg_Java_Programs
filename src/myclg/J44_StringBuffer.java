package myclg;

/*java.lang.StringBuffer:
                    -mutable
                    -you can implement the string by creating the object of StringBuffer class..

                    StringBuffer s = "java";        -->error

                    StringBuffer s = new StringBuffer("java");
                    String s1="java";
                    StringBuffer s2 = new StringBuffer(s1);


                    (inbuilt methods)
                            -length()
                            -capacity()
                            -charAt(int p)
                            -indexOf(char)
                            -lastIndexOf(char)
                            -reverse()
                            -append(String)
                            -insert(int pos,String)
                            -replace(int sp,int ep,String)
                            -deleteCharAt(int pos)
*/
public class J44_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Piku ");
        sb.append("Kumar");
        System.out.println("String is "+sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));                   //0 se start hota hai

        System.out.println(sb.insert(2,"hut"));

        System.out.println(sb.deleteCharAt(5));
        System.out.println(sb.reverse());
    }
}
