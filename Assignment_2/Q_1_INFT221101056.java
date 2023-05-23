//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person {
    private String name;
    private int age;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }  
}

public class Q_1_INFT221101056 {
    public static void main(String[] args) {
    Person person1 = new Person ("Name1",18);
    System.out.println("First person name: "+person1.getName());
    System.out.println("First person age: "+person1.getAge());

    Person person2 = new Person ("Name2",20);
    System.out.println("Second person name: "+person2.getName());
    System.out.println("Second person age: "+person2.getAge());
    }
}