package method;

import java.util.Scanner;

public class ReloadDemo {
    public static void main(String[] args) {
        System.out.println("请输入两个数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("两数之和:"+ add(a,b));

        System.out.println("请输入三个数字");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("两数之和:"+ add(a,b,c));

        System.out.println("请输入两个小数");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("两数之和:"+ add(x,y));
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }

    public static double add(double a,double b){
        return (double)a+b;
    }

}
