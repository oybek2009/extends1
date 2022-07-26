package OYBEK.Animal;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog(5, "Rex", "Dog");
        dog.show();
        dog.sound();
        System.out.println("///////////////");
        Cat cat = new Cat(3, "Momiqvoy", "Cat");
        cat.show();
        cat.sound();
        System.out.println("///////////////");
        Duck duck = new Duck(2, "Burunboy", "Duck");
        duck.show();
        duck.sound();
    }
}
