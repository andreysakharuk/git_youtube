package headfirst.lesson5;

import java.util.Scanner;

public class DotComGame {

    public static void main(String[] args) {

        int numberOfGuess = 1;
        DotCom game = new DotCom();
        int[] cells = {2, 3, 4};
        game.setLocationOfCells(cells);
        while (true) {
            System.out.println(" Введите число");
            Scanner sc = new Scanner(System.in);
            String userGuess = sc.next();
            if (game.checkUserGuess(userGuess) == "Потопил"){
                System.out.println(" Конец игры, количество попыток: " + numberOfGuess);
                break;
            }
            numberOfGuess++;
        }
        System.out.println(numberOfGuess);
    }
}

