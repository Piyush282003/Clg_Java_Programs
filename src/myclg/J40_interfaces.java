package myclg;

interface mth{
//    void display(){                                    --> agr isme default nhi lagayenge toh isme error aayega toh use default keyword for accessing this method
    default void display(){
        System.out.println("HLO");
    }
}

class Defmeth implements mth{
    public static void main(String[] args) {
        Defmeth d= new Defmeth();
        d.display();
    }
}
//public class J40_interfaces {
//    public static void main(String[] args) {
//
//    }
//}
