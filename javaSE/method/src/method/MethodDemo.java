package method;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("请输入两个数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("两数之和:"+ add(a,b));
        System.out.println("两数中的较大值为:"+max(a,b));
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int max(int a, int b){
        return a>b?a:(a<b?b:-1);    //只是为了测试三目运算符 此处逻辑是有问题的
//        if(a == b){
//            System.out.println("两数相等");
//            return a;
//        }else if(a > b){
//            return a;
//        }else {
//            return b;
//        }
    }
}
