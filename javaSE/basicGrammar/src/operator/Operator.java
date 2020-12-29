package operator;

public class Operator {
    public static void main(String[] args) {
        int a = 102;
        int b = 3;
        int res;
        res = a + b;
        System.out.println("+:" + res);
        res = a - b;
        System.out.println("-:" + res);
        res = a * b;
        System.out.println("*:" + res);
        res = a / b;
        System.out.println("/:" + res);
        res = a % b;
        System.out.println("%:" + res);

        System.out.println("b++:" + b++);
        System.out.println("++b:" + ++b);


        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2);
        System.out.println(flag1 | flag2);
        System.out.println(!flag1);

        System.out.println("--------");
        boolean flag3 = true;
        System.out.println(flag1 && flag2 && flag3);
        System.out.println(flag1 || flag2 && flag3);
        System.out.println(flag1 && !flag2 && flag3);
        System.out.println(flag1 && flag3 && flag2);
        System.out.println(flag1 && flag3 && !flag2);


    }
}
