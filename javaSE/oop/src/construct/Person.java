package construct;

public class Person{
    int age;
    String name;

    //无参构造
    Person(){
        age = 3;
        name = "无名";
    }

    //有参构造
    Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    //有参构造
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name:"+this.name+" ,age:"+age+"]";
    }
}