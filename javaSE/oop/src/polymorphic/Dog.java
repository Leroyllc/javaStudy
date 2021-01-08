package polymorphic;

public class Dog extends Pet {
    @Override
    public void say() {
        System.out.println("汪汪汪");
    }

    public void eat(){
        System.out.println("狗吃肉");
    }
}
