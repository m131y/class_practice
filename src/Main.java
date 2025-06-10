class Person {
    String name;
    String mbti;
    int age;
    double height;
    boolean isFemale;

    public void sayHello(){
        System.out.println("반갑습니다. 저는 " + name + "입니다. 저는 " + age + "세 입니다. 키는 "+ height + "cm 입니다.");
        System.out.println("mbti는 " + mbti + "입니다. 제가 여자인건 " + isFemale + "입니다.");
    }
}


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "조민영";
        person1.mbti = "INTP";
        person1.age = 25;
        person1.height = 164.8;
        person1.isFemale = true;

        person1.sayHello();
    }
}