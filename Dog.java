public class Dog {

    private String name;

    private Color color;
    private int age;

    private Breed breed;

    public Dog(String name, Color color, int age, Breed breed) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    public String getName() { return name; }

    public Color getColor() { return color; }

    public int getAge() { return age; }

    public Breed getBreed() { return breed; }

    public void setColor(Color color) {
    }

    public void setAge(int age) {
    }

    public void setBreed(Breed breed){
    }
}
