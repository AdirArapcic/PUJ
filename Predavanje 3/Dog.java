class Dog {
    String name;
    int age;
    String breed;

    // Constructor to initialize a dog with name, age, and breed
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Method to print the dog's details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Breed: " + breed);
    }
}
