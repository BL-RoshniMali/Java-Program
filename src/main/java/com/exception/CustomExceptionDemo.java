package com.exception;

import java.util.Scanner;

public class CustomExceptionDemo {
    static void validateInput(int number) throws InvalidInputException{
        if(number>100){
            throw new InvalidInputException("Invalid Exception");
        }
        System.out.println("Valid Input");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number less than 100");
        int number = scanner.nextInt();
        try {
            validateInput(number);
        }catch (InvalidInputException exception){
            System.out.println("You cannot enter a value greater than 100.");
        }
    }
}
