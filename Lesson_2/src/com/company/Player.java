package com.company;

public class Player {
    private String name;
    private int number;
    Player(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
//        if(number < 0 || number > 100){
//            System.out.println("Введенное вами число не входит в диапазон от 0 до 100");
//        }
        this.number = number;
    }

    public String getName() {
        return name;
    }
}
