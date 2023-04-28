package myclg;

public class J35_kadane_algo {
    public static void main(String[] args) {
//        int arr[] = new int[]{5,4,-1,7,8};
        int arr[] = new int[]{-2,-3,4,-1,-2,1,5,-3};


//        TC=O(n3)
//        int sum=0,m=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                sum=0;
//                for(int k=i;k<j+1;k++){
//                    sum+=arr[k];
//                    m=Math.max(sum,m);
//                }
////                System.out.println(sum);
//            }
//        }
//        System.out.println(m);



//        Tc=O(n)
        int sum=0;
        int s=0,end=0,start=0;
        int m = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
//            sum=Math.max(sum,m);
            if(sum>m){
                m=sum;
                start=s;
                end=i;
            }
            if(sum<0){
                sum=0;
                s=i+1;
            }
        }
        System.out.println("Starting index is "+start);
        System.out.println("Last index is "+end);
        System.out.println(m);
    }
}
