package myclg;

class AB{
    public static void main(String[] args) {
        System.out.println("AB");
        String str[]={""};
        BC.main(str);
        CD.main(str);
    }
//    hum main method ko overloading kr skte hai...
    public void main(){

    }
}
class BC{
    public static void main(String[] args) {
        System.out.println("BC");
    }
}
class CD{
    public static void main(String[] args) {
        System.out.println("CD");
    }
}

