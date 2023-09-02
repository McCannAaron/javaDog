public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Roger", "Golden", 9, Breed.GOLDEN_RETRIEVER);
        Dog dog2 = new Dog("Spot", "Red", 5, Breed.DACHSHUND);
        Dog dog3 = new Dog("Wolf", "Yellow", 7, Breed.GOLDEN_RETRIEVER);

        dog1.setName("Snoppy");
        System.out.println("Dog1 name: " + dog1.getName());
        System.out.println("Dog1 color: " + dog1.getColor());
        System.out.println("Dog1 age: " + dog1.getAge());
        System.out.println("Dog1 breed: " + dog1.getBreed());
        dog1.sleep();
        dog1.wokeUp();

        System.out.println(" ");

        dog2.setColor("Black");
        System.out.println("Dog2 name: " + dog2.getName());
        System.out.println("Dog2 color: " + dog2.getColor());
        System.out.println("Dog2 age: " + dog2.getAge());
        System.out.println("Dog2 breed: " + dog2.getBreed());
        dog2.bark();
        dog2.eat();

        System.out.println(" ");

        dog3.setAge(6);
        dog3.setBreed(Breed.YELLOW_LAB);
        System.out.println("Dog3 name: " + dog3.getName());
        System.out.println("Dog3 color: " + dog3.getColor());
        System.out.println("Dog3 age: " + dog3.getAge());
        System.out.println("Dog3 breed: " + dog3.getBreed());
    }
}
