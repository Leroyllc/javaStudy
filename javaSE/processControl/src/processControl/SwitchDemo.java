package processControl;

import java.util.Scanner;

/**
 * Switch案例
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("=======输入数字0-3=======");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (flag == false) {
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("zero");
                    flag = true;
                    break;
                case 1:
                    System.out.println("one");
                    flag = true;
                    break;
                case 2:
                    System.out.println("two");
                    flag = true;
                    break;
                case 3:
                    System.out.println("three");
                    flag = true;
                    break;
                default:
                    System.out.println("输入有误，重新输入");
                    flag = false;
            }
        }
    }
}
