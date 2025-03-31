




// Main.java (for Q1)
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        
        System.out.println("Dog name: " + dog.getName() + ", age: " + dog.getAge());
        dog.makeSound();
        
        System.out.println("Cat name: " + cat.getName() + ", age: " + cat.getAge());
        cat.makeSound();
    }
}