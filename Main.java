public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Roger", "Black", 9, Breed.GOLDEN_RETRIEVER);
        Dog dog2 = new Dog("Spot", 5, Breed.DACHSHUND);
        Dog dog3 = new Dog("Fido", "Yellow", 7);

        dog1.setName("Snoppy");
        dog1.setColor("Golden");
        System.out.println("Dog1 name: " + dog1.getName());
        System.out.println("Dog1 color: " + dog1.getColor());
        System.out.println("Dog1 age: " + dog1.getAge());
        System.out.println("Dog1 breed: " + dog1.getBreed());
        dog1.sleep();
        dog1.wokeUp();

        System.out.println(" ");

        dog2.setBreed(Breed.YELLOW_LAB);
        System.out.println("Dog2 name: " + dog2.getName());
        System.out.println("Dog2 age: " + dog2.getAge());
        System.out.println("Dog2 breed: " + dog2.getBreed());
        dog2.eat();

        System.out.println(" ");

        dog3.setName("Wolf");
        dog3.setAge(6);
        System.out.println("Dog3 name: " + dog3.getName());
        System.out.println("Dog3 color: " + dog3.getColor());
        System.out.println("Dog3 age: " + dog3.getAge());
        dog3.bark();
    }
}
