package arrays;

import java.util.Arrays;

/**
 * 工具类Arrays
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {3,1212,3,13,13,12,31,23,1,421,5,21,3,512,216,171,5,21};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
