package myclg;

class Piyush{
    int a;
    Piyush(){
        this.a=1000;
        System.out.println("Constructor of base");
    }
    Piyush(int a){
        this.a=a;
    }
    public void display(){
        System.out.println("the value of balance is "+a);
    }
}
class Bank extends Piyush{
    int balance;
//    Bank(){
//        this.balance=0;
//    }
//    Bank(int balacne){
//        this.balance=balacne;
//    }
    void add(int balance){
        this.balance+=balance;
        System.out.println("The add balance is "+this.balance);
    }
}
public class J24_constructor_overloading {
    public static void main(String[] args) {
//        Piyush p = new Piyush();
//        Piyush p = new Piyush(5000);
//        p.display();


//We can create Object of derived class also if we have not made any constructor of derived class..
        Bank b = new Bank();
        b.display();
        b.add(450);

    }
}
