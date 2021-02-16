package com.company;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        char operation;
        int result;
        String choice;
        Calculator calculator = new Calculator();
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            firstNumber = scanner.nextInt();
            System.out.print("Введите знак операции: ");
            operation = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            secondNumber = scanner.nextInt();
            result = calculator.calc(firstNumber,secondNumber,operation);
            System.out.println("Результат: " + result);
            do{
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scanner.nextLine();
            }while(!"no".equals(choice) && !"yes".equals(choice));
        }while(!"no".equals(choice));
    }
}
