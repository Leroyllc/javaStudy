package typeCast;

public class Demo01 {
    public static void main(String[] args) {
        int a = 10_0000_0000;
        int b = 3;
        //如果没有转换就会溢出
        int res1 = a * b;
        System.out.println("res1:" + res1);
        long res2 = a * b;
        System.out.println("res2:" + res2);
        //进行转换后，会自动转换|
//        int res4 = a * (long)b;
        long res3 = a * (long)b;
        System.out.println(res3);
    }
}
