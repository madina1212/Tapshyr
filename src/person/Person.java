package person;

public class Person {
    private final String name;
    private static int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return "Person " +
                "\nname:" + name +
                "\nage:" + age ;
    }
    public void arrey(){
    }
}
