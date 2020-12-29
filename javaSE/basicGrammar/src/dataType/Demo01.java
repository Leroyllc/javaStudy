package dataType;

/**
 * 介绍数据类型
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 基本数据类型
         */
        //整数数据类型
//        byte b = (1<<7)-1;  //7 0b10000000-0b1 = 0b1111111 = 127(10)
        byte b1 = Byte.MIN_VALUE;
        byte b2 = 0b1111111;
        System.out.println("byte范围:"+b1 + "~" + b2);

        short s1 = Short.MIN_VALUE;
        short s2 = (1<<15)-1;   //32767
        System.out.println("short范围:"+s1 + "~" + s2);

        int i1 = Integer.MIN_VALUE;
        int i2 = 2147483647+1;  //2147483647
        System.out.println("int范围:"+i1 + "~" + i2);


        //测试的时候发现，(1<<31)-1为上限，并不能表示更大的数 因此不能表示long类型的最大数字
//        long l = 9223372036854775807L;
        long l1 = Long.MIN_VALUE;
        long l2 = Long.MAX_VALUE;
        System.out.println("long范围:"+l1+"~"+l2);

        //浮点数据类型
        float f1 = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        System.out.println("float范围:"+f1+"~"+f2);

        double d1 = Double.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        System.out.println("double范围:"+d1+"~"+d2);

        //字符数据类型
        char c1 = Character.MIN_VALUE;
        char c2 = Character.MAX_VALUE;
        System.out.println("char范围:"+c1+"~"+c2);//空格以及符号
        System.out.println("char范围(int):"+(int)c1+"~"+(int)c2);//转化为int型

        //布尔数据类型
        boolean boolean1 = false;
        boolean boolean2 = true;
        System.out.println("boolean范围:"+boolean1+"&"+boolean2);

        char ca = (char)0xEFBF;
        char cb = (char)0xBDEF;
        char cd = (char)0xBFBD;
        System.out.println(""+ca+cb+cd);
    }
}
