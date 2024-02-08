package recursion;

import java.util.Arrays;

public class reverseArray {
    public void reverseWithTwoPointer(int[] arr, int l, int r){

        if(l >= r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r-1];
        arr[r-1] = temp;
        System.out.println(">> "+ Arrays.toString(arr));
        reverseWithTwoPointer(arr, l+1,r-1);
    }

    public void reverseWithOnePointer(int[] arr,int i){
       int n = arr.length;

       if(i >= n/2){
           return;
       }

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverseWithOnePointer(arr,i+1);
    }
}
