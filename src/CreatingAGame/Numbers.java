package CreatingAGame;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 3;
        int attemps = 0;
        int randomNumbers = random.nextInt(10);

        while (attemps < maxAttempts) {
            System.out.println("Загадайте случайное число от 0 до 9 : ");
            int numberPlayer = scanner.nextInt();

            if (numberPlayer == randomNumbers) {
                System.out.println("Вы выиграли!");
                break;
            } else if (numberPlayer < randomNumbers) {
                System.out.println("Число меньше! Попробуйте еще раз!");
            } else {
                System.out.println("Число больше! Попробуйте еще раз!");
            }
            attemps++;
        }
        if (attemps==maxAttempts){
            System.out.println("Вы проиграли!");
    }


        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int playerChoice = scanner.nextInt();

        if (playerChoice==1){
            guessTheNumber();
        }else {
            System.out.println("До свидания !");
        }
    }
}
