package lesson6;

public abstract class Animal {
    private static int counter ;
    public Animal(){
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    abstract boolean run(int length);
    abstract boolean sail(int length);
}
