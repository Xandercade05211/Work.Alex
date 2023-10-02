package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSigh();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSigh() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        //3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и
        //инициализируйте их любыми значениями, которыми захотите. Далее метод должен
        //просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль
        //сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    }

    public static void printColor() {
        int value = 98;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }

        //4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
        //ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен
        //вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100
        //включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }

        //5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и
        //инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то
        //необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    }
}