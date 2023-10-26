package lesson6;

public class Test {
    private static int counter = 0;

    public Test() {
        counter++;
    }
    public static int countAnimal(){
        return counter;
    }

    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.run(200);
        cat.sail(0);
        dog.run(500);
        dog.sail(10);
        System.out.println(Test.countAnimal());
    }
}
