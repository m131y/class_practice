class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name);
    }
    void hello() {
        System.out.println("hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("gott",23);
        Person person2 = new Person("ejwkf",22);

        person2.hello();
        person1.hello();
    }
}