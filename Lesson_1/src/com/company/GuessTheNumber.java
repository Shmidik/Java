package com.company;

public class GuessTheNumber {
    public static void main(String[] args) {
        int guessNumber = 69;
        int personNumber = 64;
        while (personNumber != guessNumber) {
            if (personNumber > guessNumber) {
                System.out.println("Ваше число" + personNumber + "больше того, что загадал компьютер");
                personNumber--;
            }
            if (personNumber < guessNumber) {
                System.out.println("Ваше число" + personNumber + "меньше того, что загадал компьютер");
                personNumber++;
            }
        }
        System.out.println("Вы угадали");
    }
}
