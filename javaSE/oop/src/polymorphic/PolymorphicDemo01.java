package polymorphic;

public class PolymorphicDemo01 {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.say();

        Pet cat = new Cat();
        cat.say();

        Pet dog = new Dog();
        dog.say();

        Pet p1 = new Dog();
        Dog p2 = new Dog();
        p1.say();
//        p1.eat();
        p2.eat();
        p2.eat();
    }
}