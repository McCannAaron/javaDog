public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Roger", "Yellow", 9, Breed.YELLOW_LAB);
        Dog dog2 = new Dog("Spot", "Black", 5, Breed.DACHSHUND);
        Dog dog3 = new Dog("Wolf", "Golden", 3, Breed.GOLDEN_RETRIEVER);
        System.out.println("Dog name: " + dog1.getName());
        dog1.setName("Snoppy");
        System.out.println("New name: " + dog1.getName());
    }
}
