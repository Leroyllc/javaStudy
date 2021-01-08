package polymorphic;

public class Cat extends Pet {
    @Override
    public void say() {
        System.out.println("喵喵喵");
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
}
