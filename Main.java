public class Main{
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cow cow = new Cow();

        System.out.println(cow.isAlive);
        System.out.println(dog.isAlive);

        dog.walk();
        cow.walk();

        System.out.println(cow.age);
        System.out.println(dog.age);

        cow.speak();
        dog.speak();
    }
}