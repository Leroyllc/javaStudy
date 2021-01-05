package processControl;

/**
 * do-while案例
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do{
            sum+=i;
            i++;
        }while (i<=100);
        System.out.println(i-1+"个数字的和为:"+sum);
    }
}
