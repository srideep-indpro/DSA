package Array;

import java.util.Arrays;

public class Print3Largest {
    /*static void print3largest(int arr[])
    {
        int i, first, second, third;

        *//* There should be atleast three elements *//*
        if (arr.length < 3) {
            System.out.print(" Invalid Input ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            *//* If current element is greater than
            first*//*
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }

            *//* If arr[i] is in between first and
            second then update second  *//*
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third)
                third = arr[i];
        }

        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }*/

    static void print3largestUsingSort(int arr[]){
        Arrays.sort(arr); // It uses Tuned Quicksort with
        // avg. case Time complexity = O(nLogn)
        int n = arr.length;
        int check = 0, count = 1;

        for (int i = 1; i <= n; i++) {

            if (count < 4) {
                if (check != arr[n - i]) {
                    // to handle duplicate values
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            }
            else
                break;
        }
    }

    /* Driver program to test above function*/
    public static void main(String[] args)
    {
        int arr[] = { 12, 13, 1, 10, 34, 1 };
//        print3largest(arr);
        print3largestUsingSort(arr);
    }
}
