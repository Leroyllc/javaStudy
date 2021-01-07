package arrays;

import java.io.PrintStream;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        System.out.println(arr[10]);

        System.out.close();

        System.out.println("aaa");
    }
}
