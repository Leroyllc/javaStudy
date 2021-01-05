package processControl;

/**
 * ForEach案例
 */
public class ForEachDemo {
    public static void main(String[] args) {
        int[] list = new int[10];

        for (int i = 0; i < 10; i++) {
            list[i] = i;
        }

        for (int i : list) {
            System.out.print(i+" ");
        }
    }
}
