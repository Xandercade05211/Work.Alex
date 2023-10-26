package lesson6;

public class Dog extends Animal {
    public final int lengthRun = 500;
    public final int lengthSail = 10;

    @Override
    public final boolean run(int length) {
        if (length==lengthRun){
            System.out.println("Собака пробежала 500 метров");
        }
        return false;
    }

    @Override
    public final boolean sail(int length) {
        if (length==lengthSail){
            System.out.println("Собака проплыла 10 метров");
        }
        return false;
    }
}
