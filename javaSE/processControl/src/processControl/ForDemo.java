package processControl;

/**
 * for案例
 */
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("100个数的和为:" + sum);
    }
}
