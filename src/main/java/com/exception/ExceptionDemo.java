package com.exception;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int a= 10, b=0;
            int c = a/b;
            System.out.println(c);
        }
//        catch (ArithmeticException e){
//            System.out.println("you can not divide any number with 0");
//        }
        finally {
            System.out.println("this block will always be excetued");
        }
    }
}
