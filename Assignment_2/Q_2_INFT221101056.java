//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class Dog {
    private String name;
    private String breed;

    Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }  
}

class Q_2_INFT221101056 {
    public static void main(String[] args) {
    Dog Dog1 = new Dog ("Name1","Breed1");
    System.out.println("First Dog name: "+Dog1.getName());
    System.out.println("First Dog breed: "+Dog1.getBreed());

    System.out.println("Set Name and Breed");

    Dog1.setName("Name2");
    Dog1.setBreed("Breed2");
    System.out.println("First Dog name: "+Dog1.getName());
    System.out.println("First Dog breed: "+Dog1.getBreed());

    Dog Dog2 = new Dog ("Name3","Breed3");
    System.out.println("Second Dog name: "+Dog2.getName());
    System.out.println("Second Dog breed: "+Dog2.getBreed());

    System.out.println("Set Name and Breed");

    Dog2.setName("Name4");
    Dog2.setBreed("Breed4");
    System.out.println("Second Dog name: "+Dog2.getName());
    System.out.println("Second Dog breed: "+Dog2.getBreed());
    }
}