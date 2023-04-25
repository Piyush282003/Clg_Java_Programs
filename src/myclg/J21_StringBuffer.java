package myclg;

public class J21_StringBuffer {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        sb.append("Hello");
//        sb.append(" ");
//        sb.append("World");
//        System.out.println(sb);
//        sb.append("Hello");
//        sb.append(" ");
//        sb.append("world");
//        String message = sb.toString();
//        System.out.println(message);




//        StringBuffer sb = new StringBuffer("Hello ");
//        sb.append("Java"); // now original string is changed
//        System.out.println(sb);




//        StringBuffer sb = new StringBuffer("Hello ");
//        sb.insert(1, "Java");
//        // Now original string is changed
//        System.out.println(sb);
//
//
//
//
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.replace(1, 3, "Java");
//        System.out.println(sb);




//        StringBuffer sb = new StringBuffer("Hello");
//        sb.delete(1, 3);
//        System.out.println(sb);




//        StringBuffer sb = new StringBuffer("Hello");
//        sb.reverse();
//        System.out.println(sb);



////        The capacity() method of StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of characters increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
////        For instance, if your current capacity is 16, it will be (16*2)+2=34.
//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity()); // default 16
//        sb.append("Hello");
//        System.out.println(sb.capacity()); // now 16
//        sb.append("java is my favourite language");
//        System.out.println(sb.capacity());
//        // Now (16*2)+2=34     i.e (oldcapacity*2)+2





//
//        StringBuffer s = new StringBuffer("GeeksforGeeks");
//
//        // Getting the length of the string
//        int p = s.length();
//
//        // Getting the capacity of the string
//        int q = s.capacity();
//
//        // Printing the length and capacity of
//        // above generated input string on console
//        System.out.println("Length of string GeeksforGeeks="
//                + p);
//        System.out.println(
//                "Capacity of string GeeksforGeeks=" + q);









//        StringBuffer s = new StringBuffer("Geeksfor");
//
//        // Usage of append() method
//        s.append("Geeks");
//
//        // Returns GeeksforGeeks
//        System.out.println(s);
//
//        s.append(1);
//        // Returns GeeksforGeeks1
//        System.out.println(s);






        StringBuffer s = new StringBuffer("GeeksforGeeks");

        s.delete(0, 5);
        // Returns forGeeks
        System.out.println(s);

        s.deleteCharAt(7);
        // Returns forGeek
        System.out.println(s);
    }
}
