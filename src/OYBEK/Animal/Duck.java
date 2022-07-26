package OYBEK.Animal;

public class Duck extends Cat {
    public Duck(int year, String name, String pet) {
        super(year, name, pet);
    }

    @Override
    public void sound() {
        System.out.println("G`oq, g`oq");
    }
}
