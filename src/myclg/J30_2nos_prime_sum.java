package myclg;

import java.util.Scanner;

class Greaterthann2 extends Exception{
    public String toString(){
        return "n1 is greater than n2";
    }
    public String getMessage(){
        return "Therefore Invalid bhai";
    }
}
class Sumiszero extends Exception{
    public String getMessage(){
        return "Sum is zero bhai";
    }
}
class Inp{
    public int n1,n2;
    Inp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        n1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        n2=sc.nextInt();
    }
}
//class Sumprime extends Inp throws Greaterthann2{                    //-->hum throws wala methods me use kr skte hai pr class me nhi
class Sumprime extends Inp{
    public int sum;
    public int sum() throws Greaterthann2{
        if(n1>n2){
            throw new Greaterthann2();
        }
        sum=0;
        for(int i=n1;i<=n2;i++){
            if(i==1){
                continue;
            }
            boolean flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
//                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("The sum is "+sum);
        return sum;
    }
}
class Even extends Sumprime{
    public int cnt;
    public void display() throws Sumiszero{
        if(sum==0){
            throw new Sumiszero();
        }
        cnt=0;
        while(sum!=0){
            int d=sum%10;
            if(d%2==0){
                cnt++;
            }
            sum=sum/10;
        }
        System.out.println("The no. of even numbers in sum is "+cnt);
    }
}
public class J30_2nos_prime_sum {
    public static void main(String[] args) {
//        Sumprime s = new Sumprime();
        Even e1 = new Even();
        try{
            e1.sum();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        try{
            e1.display();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
