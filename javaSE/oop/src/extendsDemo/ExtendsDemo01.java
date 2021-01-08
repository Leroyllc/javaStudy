package extendsDemo;

public class ExtendsDemo01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.speak();    //Student类中并没有speak方法，但是Student继承自Person，连同Person的speak方法都继承了
        System.out.println(student.age);
//        System.out.println(student.name);
    }
}
