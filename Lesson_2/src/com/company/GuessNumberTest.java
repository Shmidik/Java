package com.company;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player playerOne = new Player("Вася");
        Player playerTwo = new Player("Петя");
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        guessNumber.game();
    }
}
