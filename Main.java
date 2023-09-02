public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Roger", Color.YELLOW, 9, Breed.YELLOW_LAB);
        Dog dog2 = new Dog("Spot", Color.BLACK, 5, Breed.DACHSHUND);
        Dog dog3 = new Dog("Wolf", Color.YELLOW, 3, Breed.GOLDEN_RETRIEVER);
        System.out.println("Dog name: " + dog1.getName());
        System.out.println(" ");
        System.out.println("Dog color: " + dog1.getColor());
    }
}
