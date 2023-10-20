package lesson4;
public class Test {
    public static void main(String[] args){
        //Инициализация поля
        TicTacToeInProceduralStyle.initMap();
        //Вывод поля на экран
        TicTacToeInProceduralStyle.printMap();

        while (true) {
            // Ход человека
            TicTacToeInProceduralStyle.humanTurn();
            // Вывод куда сходил
            TicTacToeInProceduralStyle.printMap();
            // Проверка победы
            if (TicTacToeInProceduralStyle.checkWin(TicTacToeInProceduralStyle.dotX)){
                System.out.println("Победы человека");
                break;
            }
            // Проверка ничьи
            if (TicTacToeInProceduralStyle.isMapFull()){
                System.out.println("Ничья!");
                break;
            }

            // Ход ИИ
            TicTacToeInProceduralStyle.alTurn();
            // Вывод куда сходил ИИ
            TicTacToeInProceduralStyle.printMap();
            // Проверка победа ИИ
            if (TicTacToeInProceduralStyle.checkWin(TicTacToeInProceduralStyle.dotO)){
                System.out.println("Победа ИИ");
                break;
            }
            // Проверка ничьи
            if (TicTacToeInProceduralStyle.isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
    }
}
