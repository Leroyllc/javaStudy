package processControl;

import java.util.Scanner;

/**
 * if-else案例
 */
public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        if(sc.hasNextInt()){
            int i = sc.nextInt();
            System.out.println("输入的是整数:"+i);
        }else {
            System.out.println("输入的不是整数");
        }

        float f = 0.0f;
        System.out.println("请输入小数");
        if(sc.hasNextFloat()){
            f = sc.nextFloat();
            System.out.println("输入的是小数:"+f);
        }else {
            System.out.println("输入的不是小数");
        }


        //第二个案例

        double score = 0.0f;

        System.out.println("请输入成绩");
        score = sc.nextDouble();
        if(score >= 90 && score <= 100){
            System.out.println("A级");
        }else if(score >= 80 && score <90){
            System.out.println("B级");
        }else if(score >= 70 && score <80){
            System.out.println("C级");
        }else if(score >= 60 && score <70){
            System.out.println("D级");
        }else if(score >= 0 && score < 60){
            System.out.println("E级");
        }else {
            System.out.println("成绩不合法");
        }
    }
}
