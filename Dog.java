public class Dog {

    private String name;

    private String color;
    private int age;

    private Breed breed;

    public Dog(String name, String color, int age, Breed breed) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() { return color; }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() { return age; }

    public void setAge(int age) {
        this.age =age;
    }

    public Breed getBreed() { return breed; }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    public void wokeUp() {
        System.out.println(getName() + " woke up.");
    }

    public void bark() {
        System.out.println(getName() + " is barking!");
    }

    public void eat() {
        System.out.println(getName() + " is eating.");
    }
}
