package lesson6;

public class Cat extends Animal {
    public final int lengthRun = 200;
    public final String lengthSail = "Кот не умеет плавать!";

    @Override
    public final boolean run(int length) {
        if (length <= lengthRun) {
            System.out.println("Кот пробежал" + length + " метров ");
        }
        return false;
    }

    @Override
    public final boolean sail(int length) {
        System.out.println(lengthSail);
        return false;
    }
}
