package com.company;
import java.util.Scanner;

public class GuessNumber {

    final Scanner scanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private int guessNumber;
    String choice;
    public GuessNumber(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private int Guess(){
        return (int) (Math.random() * 100);
    }

    private boolean Check(Player player){
        if (player.getNumber() == guessNumber){
            System.out.println("Поздравляем, игрок " + player.getName() + " угадал число " + player.getNumber());
            return true;
        }else {
            System.out.println("Неудача. Повезет в другой раз");
            return false;
        }
    }

    public void game(){
        do{
            guessNumber = Guess();
            System.out.println("Компьютер загадал число от 0 до 100. Ваша задача угадать это число! ");
            int countOne = 1, countTwo = 1;
            while (true){
                System.out.print(countOne + " попытка игрока " + playerOne.getName() + ", его число - ");
                playerOne.setNumber(scanner.nextInt());
                countOne++;
                if(Check(playerOne)){
                    System.out.println("Попыток " + (countOne - 1));
                    break;
                }

                System.out.print(countTwo + " попытка игрока " + playerTwo.getName() + ", его число - ");
                playerTwo.setNumber(scanner.nextInt());
                countTwo++;
                if(Check(playerTwo)) {
                    System.out.println("Попыток " + (countTwo - 1));
                    break;
                }
            }
            do{
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scanner.nextLine();
            }while (!"нет".equals(choice) && !"да".equals(choice));
        }while (!"нет".equals(choice));
    }
}
