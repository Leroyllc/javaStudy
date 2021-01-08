package extendsDemo;

//继承关键字为extends Student的父类为Person
public class Student extends Person {
    private String name = "李四";

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public void showName(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
