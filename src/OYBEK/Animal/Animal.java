package OYBEK.Animal;

public class Animal {
    int year;
    String name;
    String pet;

    public Animal(int year, String name, String pet) {
        this.year = year;
        this.name = name;
        this.pet = pet;
    }


    public void sound() {
        System.out.println("Wow, wow");
    }

    public void show() {
        System.out.println("Name:" + name);
        System.out.println("Year: " + year);
        System.out.println("Pet: " + pet);


    }
}

