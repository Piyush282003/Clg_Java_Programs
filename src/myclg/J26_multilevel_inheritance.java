package myclg;
//types:
//1. single level inheritance
//2. multi level inheritance
//3. hierarchical inheritance
//4. multiple inheritance
//5. hybrid inheritance

import java.util.Scanner;

class A{
    public int [] arr;

    A(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

}
class B extends A{
   public int sum(){
       int s=0;
       for(int i=0;i<arr.length;i++){
           int n=arr[i];
           int t=0;
           while(n!=0){
               t+=n%10;
               n=n/10;
           }
           s+=t;
       }
       return s;
   }
}
class C extends B{
    public void display(){
        int res=sum();
        System.out.println("The sum of all elements of array is "+res);
    }
}
public interface J26_multilevel_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
