//package myclg;
//
//import java.util.Scanner;
//
//class BankingSystem{
//    public int paisa=10000;
//    boolean present=false;
//    Scanner sc = new Scanner(System.in);
//
//    void createaccount(){
//        System.out.println("Enter username");
//        u = sc.nextLine();
//        System.out.println("Enter password in number");
//        n = sc.nextInt();
//        System.out.println("Your account has been created");
//    }
//    void deposit(){
//        System.out.println("Enter username");
//        String u = sc.nextLine();
//        login(u);
//        if(present){
//            System.out.println("Enter the amount of money you want to add..");
//            int addmoney= sc.nextInt();
//            paisa+=addmoney;
//        }
//        else{
//            System.out.println("You have to login..");
//        }
//    }
//    void login(String u2){
////        if(u2){
//            present=true;
////        }
//    }
//    void logout(String u2){
//        present=false;
//    }
//    void checkbalance(){
//        System.out.println("The available balance is "+paisa);
//    }
//    void withdraw(){
//        System.out.println("Enter the amnt you want to withdraw..");
//        int wdrw = sc.nextInt();
//        if(wdrw<=paisa){
//            paisa-=wdrw;
//        }
//        else{
//            System.out.println("Jaa be..Aukaat me reh..");
//        }
//    }
//
//}
//public class J22_bankingsystem {
//    public static void main(String[] args) {
//        BankingSystem b = new BankingSystem();
//        Scanner sc= new Scanner(System.in);
////        System.out.println("Do you have account-->y/n");
////        char ch1 = sc1.next().charAt(0);
////        if(ch1=='n'){
////            b.createaccount();
//////            for(String usr:b.arr){
//////                if(usr==null){
//////                    continue;
//////                }
//////                System.out.println(usr);
//////            }
////        }
////        System.out.println("What do u want to do?  1-->deposit  2-->checkbalance  3-->withdraw  4-->nothing  5-->logout  6-->Create other account");
////        int n = sc1.nextInt();
////        while(n!=4){
////            if(n==1){
////                b.deposit();
////                System.out.println("What do u want to do?  1-->deposit  2-->checkbalance  3-->withdraw  4-->nothing  5-->logout");
////                n = sc1.nextInt();
////            }
////            else if(n==2){
////                b.checkbalance();
////                System.out.println("What do u want to do?  1-->deposit  2-->checkbalance  3-->withdraw  4-->nothing  5-->logout");
////                n = sc1.nextInt();
////            }
////            else if(n==3){
////                b.withdraw();
////                System.out.println("What do u want to do?  1-->deposit  2-->checkbalance  3-->withdraw  4-->nothing  5-->logout");
////                n = sc1.nextInt();
////            }
////            else if(n==5){
////                System.out.println("Do u want to logout? --y/n");
////                ch1=sc1.next().charAt(0);
////                if(ch1=='y'){
////                    System.out.println("Enter the name of user");
////                    String usrname= sc1.nextLine();
////                    b.logout(usrname);
////                }
////            }
////            else if(n==6){
////                b.createaccount();
////            }
////        }
////        System.out.println("Thank You...");
//
//    }
//}
