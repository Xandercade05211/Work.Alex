package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeInProceduralStyle {
    static char[][] map;
    static final int size = 3;

    static final char dotEmpty = '•';
    static final char dotX = 'X';
    static final char dotO = 'O';

    static void initMap() {
        map = new char[size][size];
        for (int line = 0; line < map.length; line++) {
            for (int columns = 0; columns < map.length; columns++) {
                map[line][columns] = dotEmpty;
            }
        }
    }

    static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int row = 0; row < size; row++) {
            System.out.print((row + 1) + " ");

            for (int columns = 0; columns < size; columns++) {
                System.out.print(map[row][columns] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do {
            System.out.println("Введите координаты Х и У : ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = dotX;
    }

    static void alTurn() {
        Random random = new Random();

        int x;
        int y;

        do {

            System.out.println("Координаты компьютера : ");
            x = random.nextInt();
            y = random.nextInt();

        } while (!isCellValid(x, y));

        System.out.println("Компьтер походил : " + (x + 1) + (y + 1));

        map[y][x] = dotO;
    }

    static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) {
            return false;
        }
        if (map[y][x] == dotEmpty) {
            return true;
        }
        return false;
    }

    static boolean checkWin(int simb) {
        if (map[0][0] == simb && map[0][1] == simb && map[0][2] == simb) {
            return true;
        }
        if (map[1][0] == simb && map[1][1] == simb && map[1][2] == simb) {
            return true;
        }
        if (map[2][0] == simb && map[2][1] == simb && map[2][2] == simb) {
            return true;
        }
        if (map[0][0] == simb && map[1][0] == simb && map[2][0] == simb) {
            return true;
        }
        if (map[0][1] == simb && map[1][1] == simb && map[2][1] == simb) {
            return true;
        }
        if (map[0][2] == simb && map[1][2] == simb && map[2][2] == simb) {
            return true;
        }
        if (map[0][0] == simb && map[1][1] == simb && map[2][2] == simb) {
            return true;
        }
        if (map[0][2] == simb && map[1][1] == simb && map[2][0] == simb) {
            return true;
        }
        return false;
    }
    static boolean isMapFull(){
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (map[row][column] == dotEmpty){
                    return false;
                }
            }
        }
        return true;
    }

}


