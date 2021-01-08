package base;

/**
 * oop object-oriented programming 面向对象编程
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.HelloObject();
        //以下是静态方法的一些用法
        demo01.HelloObject(1);  //通过对象调用
        Demo01.HelloObject(2);  //通过类名调用
        HelloObject(3);         //静态方法中直接调用(由于该方法是存在于同一个类之中，所以也能直接调用)
    }

    public void HelloObject(){
        System.out.println("hello oop!");
    }

    //这里的i是形式参数，并没有实际的值，在执行方法之前会占用。调用方法的时候有了值传递
    public static void HelloObject(int i){
        System.out.println("hello oop"+i);
    }
}
