package com.company;

public class Calculator {
    public int calc(int first, int second, char operation){
        switch (operation){
            case '+': return addition(first,second);
            case '-': return subtraction(first, second);
            case '*': return multiplication(first, second);
            case '/': return division(first, second);
            case '^': return power(first, second);
            case '%': return rest(first, second);
            default:
                System.out.println("Неверный знак операции"); return -1;
        }
    }
    private int addition(int first, int second){
        return first + second;
    }
    private int subtraction(int first, int second){
        return first - second;
    }
    private int multiplication(int first, int second){
        return first * second;
    }
    private int division(int first, int second){
        return first / second;
    }
    private int power(int first, int second){
        int result = 1;
        for (int i = 0; i < second; i++){
            result *= first;
        }
        return result;
    }
    private int rest(int first, int second){
        return first % second;
    }
}
