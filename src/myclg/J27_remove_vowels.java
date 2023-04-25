package myclg;

import java.util.Scanner;

class A1{
    public char arr[];
    A1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        arr = new char[n];
        System.out.println("Enter the elements of character array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
    }
}
class B1 extends A1{
    public void removeVowels(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A' || arr[i]=='E'|| arr[i]=='I'|| arr[i]=='O'|| arr[i]=='U'|| arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u'){
                arr[i]='n';
            }
        }
    }
}
class C1 extends B1{
    public void display(){
        removeVowels();
        System.out.print("Elements of array without vowels are:- ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='n'){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
public class J27_remove_vowels {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.display();
    }
}
