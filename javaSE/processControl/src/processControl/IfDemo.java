package processControl;

import java.util.Scanner;

/**
 * if案例
 */
public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        if(sc.hasNext()){
            System.out.println(sc.next());
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入");
        if(sc1.hasNextLine()){
            System.out.println(sc1.nextLine());
        }

        //输入hello world 得到两个不一样的结果
    }
}
