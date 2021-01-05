package processControl;

/**
 * Continue案例
 */
public class ContinueDemo {
    public static void main(String[] args) {
        System.out.println("输出100以下不能整除3的数字");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
