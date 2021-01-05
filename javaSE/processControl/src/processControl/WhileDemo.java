package processControl;

import java.util.Scanner;

/**
 * while案例
 */
public class WhileDemo {
    public static void main(String[] args) {
        System.out.println("while的使用");

        int count = 0; //计数器
        double sum = 0.0f; //和

        System.out.println("请输入数据 输入非数字结束");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextDouble()){
            sum += sc.nextDouble();
            count++;
        }

        System.out.println(count + "个数的和为：" + sum);
        System.out.println(count + "个数的平均值为：" + sum / count);

        System.out.println("============demo2==========");

        sum = 0.0f;
        int i = 0;

        while(i <= 100){
            sum+=i;
            i++;
        }
        System.out.println("和为:"+sum);
    }
}
