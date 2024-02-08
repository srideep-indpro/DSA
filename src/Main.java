import java.util.*;
import java.util.concurrent.BlockingDeque;

public class Main {

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

//    [1,2,3,4] => [24,24,24,24] => [24, 12, 8, 6]

    public int[] arrProduct(int[] arr) {
        int product = 1;
        boolean zeroFlag = false;
        int[] newArr = new int[arr.length];
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zeroCount++;
            }
        }
        if(zeroCount == arr.length){
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroFlag = true;
                continue;
            }
            product = product * arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            if (zeroFlag) {
                if (arr[i] != 0) {
                    newArr[i] = 0;
                    continue;
                }
                newArr[i] = product;
            } else {
                if (arr[i] == 0) {
                    newArr[i] = 0;
                    continue;
                }
                newArr[i] = product / arr[i];
            }

        }


        return newArr;
    }

    public static void main(String[] args) {
        Main main = new Main();
//        System.out.println(main.removeElement(new int[]{3, 2, 2, 3}, 3));
        int[] newArr = main.arrProduct(new int[]{0,4,0});
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
//        System.out.println(main.arrProduct(new int[]{1, 2, 3, 4}));
    }
}