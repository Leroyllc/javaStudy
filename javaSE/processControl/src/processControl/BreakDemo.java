package processControl;

import java.util.Scanner;

/**
 * break案例
 */
public class BreakDemo {
    public static void main(String[] args) {
        long sum = 0;
        int i;
        System.out.println("输入停止的数字");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
            if (i == limit) break;
            System.out.println("当前数字是：" + i + "目前的和为：" + sum);
        }
    }
}
