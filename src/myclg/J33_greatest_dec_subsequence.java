package myclg;

import java.util.Scanner;

public class J33_greatest_dec_subsequence {

    public static int countDecrease(int[] arr) {
        int count = 0;
        int max=Integer.MIN_VALUE,k=1;                        //k=1 isliye coz humne ek kadam aage se shuru kiya hai ,i.e, 1 toh k=0 se vo ek kum btayega..
        boolean inSequence = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                if (!inSequence) {
                    inSequence = true;
                    count++;
                }
                k++;
            }
            else {
                k=1;
                inSequence = false;
            }
            max=Math.max(k,max);
        }
        System.out.println(max);
        return count;
    }

    public static void main(String[] args) {

        int []arr = new int[]{4,3,2,1,0,-23,-45,2,3,7,6,5,9,8,6,12,23,54,3,2,1,0,-1};

        int numSequences = countDecrease(arr);
        System.out.println("Number of decreasing sequences: " + numSequences);

    }
}

