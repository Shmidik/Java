package com.company;

import java.net.SocketTimeoutException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int first = 10;
        int second = 5;
        char operation = '^';

        if( operation == '+'){
            System.out.println(first + second);
        } else if(operation == '-'){
            System.out.println(first - second);
        }else if(operation == '*'){
            System.out.println(first * second);
        }else if(operation == '/'){
            System.out.println(first / second);
        }else if(operation == '^'){
            int result = 1;
            for(int i = 0; i < second; i++){
                result *= first;
            }
            System.out.println(result);
        }else if(operation == '%'){
            System.out.println(first % second);
        }
    }
}
