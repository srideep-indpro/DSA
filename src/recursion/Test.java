package recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

        public int factorial(int number){
        System.out.println("number:" + number);
        if(number == 0 || number == 1){
            return 1;
        }
        int i =1;
        i = number * factorial(number - 1);
        return i;
    }
    /*public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }*/

    public static void main(String[] args) {
        Test test = new Test();
        reverseArray rv = new reverseArray();
        int[] arr = {1,2,3,4,5};
        rv.reverseWithOnePointer(arr, 0);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
//        rv.reverseWithTwoPointer(arr, 0, arr.length);
//        System.out.println(test.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
