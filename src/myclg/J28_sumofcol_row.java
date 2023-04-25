package myclg;

//types:
//1. single level inheritance
//2. multi level inheritance
//3. hierarchical inheritance
//4. multiple inheritance
//5. hybrid inheritance

import java.util.Scanner;

class A3{
    public int [][] arr;
    int n,m;
    A3(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows of array:");
        n=sc.nextInt();
        System.out.println("Enter the columns of array:");
        m=sc.nextInt();
        arr = new int[n][m];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

}
class B3 extends A3{
    public int sum(){
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i][0];
        }
        for(int i=0;i<m;i++){
            s+=arr[0][i];
        }
        return s;
    }
}
class C3 extends B3{
    public void display(){
        int res=sum();
        System.out.println("The sum of all elements of array is "+res);
    }
}

public class J28_sumofcol_row {
    public static void main(String[] args) {
        C3 obj = new C3();
        obj.display();
    }
}
