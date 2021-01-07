package arrays;

import java.util.Arrays;

/**
 * 三种方式初始化数组
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        /**
         * 静态初始化
         */
        int[] arrays1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            System.out.print(arrays1[i]+" ");
        }
        System.out.println();

        /**
         * 动态初始化
         */
        int[] arrays2 = new int[10];
        arrays2[0] = 'a';
        for (int i = 1; i < 10; i++) {
            arrays2[i] = i * i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arrays2[i]+" ");
        }
        System.out.println();

        /**
         * 默认初始化
         */
        int[] arrays3 = new int[5];
        int len = 5;
        String[] arrays4 = new String[len];
        char[] arrays5 = new char[5];
        double[] arrays6 = new double[5];
        boolean[] arrays7 = new boolean[5];

        for (int i = 0; i < 5; i++) {
            System.out.print(arrays3[i]);
            System.out.print(" " + arrays4[i]);
            System.out.print(" " + arrays5[i]);
            System.out.print(" " + arrays6[i]);
            System.out.println(" " + arrays7[i]);
        }
        //输出的几个类型都有默认值
        //int-0 对象-null char-' ' double-0.0 boolean-false
    }
}
