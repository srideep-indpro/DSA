package Array;

import java.util.Arrays;

/**
 * Rearrange array such that even positioned are greater than odd
 * Input : A[] = {1, 2, 2, 1}
 * Output :  1 2 1 2
 * Explanation :
 * For 1st element, 1  1, i = 2 is even.
 * 3rd element, 1  1, i = 4 is even.
 * Input : A[] = {1, 3, 2}
 * Output : 1 3 2
 * Explanation :
 * Here, the array is also sorted as per the conditions.
 * 1  1 and 2 < 3.
 *
 *
 * Observe that array consists of [n/2] even positioned elements.
 * If we assign the largest [n/2] elements to the even positions and the rest of the elements to the odd positions,
 * our problem is solved.
 */
public class EvenHigherThanOddPlace {

    static void assign(int a[], int n)
    {
        // Sort the array
        Arrays.sort(a);

        int ans[] = new int[n];
        int p = 0, q = n - 1;
        for (int i = 0; i < n; i++) {

            // Assign even indexes with maximum elements
            if ((i + 1) % 2 == 0)
                ans[i] = a[q--];

                // Assign odd indexes with remaining elements
            else
                ans[i] = a[p++];
        }

        // Print result
        for (int i = 0; i < n; i++)
            System.out.print(ans[i] + " ");
    }

    // Driver code
    public static void main(String args[])
    {
        int A[] = { 1, 3, 2, 2, 5 };
        int n = A.length;
        assign(A, n);
    }
}
