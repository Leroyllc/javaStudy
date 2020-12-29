package variable;

import com.sun.imageio.plugins.common.I18N;

public class Variable {
    static int i0 = 0;

    static {
        int i1 = 1;
    }

    int i2;

    final int i3 = 3;

    public static void main(String[] args) {
        int i4 = 4;
        System.out.println("i0:"+i0);
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);
        System.out.println("i4:"+i4);
        new Variable().test1(i4);

        System.out.println("--------------");
        i0*=10;
//        i1*=10;
//        i2*=10;
//        i3*=10;
        i4*=10;

        System.out.println("i0:"+i0);
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);
        System.out.println("i4:"+i4);
        new Variable().test1(i4);
    }

    public void test1(int i){
        System.out.println("i0:"+i0);
//        System.out.println(i1);
        System.out.println("i2:"+i2);
//        System.out.println(i3);
//        System.out.println(i4);
        System.out.println("i:"+i);
    }
}
