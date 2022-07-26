package OYBEK.Animal;

public class Cat extends Dog {


    public Cat(int year, String name, String pet) {
        super(year, name, pet);
    }

    @Override
    public void sound() {
        System.out.println("Miyov, miyov");
    }
}
