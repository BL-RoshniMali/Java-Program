package com.lambdaexpression;

interface Calculator{
    void add(int num1, int num2);
}

class MathCalculator{
    public static void addSomething(int num1, int num2){
        System.out.println("Addition is: "+(num1+num2));
    }
}

public class MethodReference {

    public static void main(String[] args) {
//        MathCalculator.addSomething(9,8);

        // Reference to a Static Method
//        Calculator cRef = Calculator::addSomething; //Method Reference
//        cRef.add(11, 21);
    }

}
