public class Dog extends Pet {
    // Instance variable(s)
    private String name;
    private int age;
    private String breed;

    // Constructors
    public Dog(String a, int b, String c) {
        super(a, b);
        this.breed = c;
    }
    public Dog() {
        this.name = "Fido";
        this.age = 1;
    }


    // makeNoise() method
    public void makeNoise() {
        System.out.println("Bark!");
    }

    // toString method
    public String toString() {
        String str = "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + this.breed;
        return str;
    }


    // Getter
    public String getBreed() {
        return this.breed;
    }


    // Setter
    public void setBreed(String breed) {
        // Don't allow blank breed
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }
}