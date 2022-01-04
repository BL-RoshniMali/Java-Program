package com.lambdaexpression;

//@FunctionalInterface
//interface Cab{ // When an interface will have exactly 1 abstract method we can say it as a functional interface
//    void bookCab(); //-> by default public abstract void bookCab();
////    void bookCab(String source, String destination);
////    double bookCab(String source, String destination);
//}

//class Uber implements Cab{
//
//    @Override
//    public void bookCab() {
//        System.out.println("Your ride is booked!!");
//    }
//}

public class LambdaExpression {

    public static void main(String[] args) {
        // 1st way
//        Cab cab = new Uber();
//        cab.bookCab();

        // 2nd way
        // Anonymous class implementation
//        Cab cab = new Cab() {
//            @Override
//            public void bookCab() {
//                System.out.println("Using Anonymous Class");
//                System.out.println("Your ride is booked!!");
//            }
//        };
//        cab.bookCab();

//         3rd way
//         Using a lambda expression -> functional interface
//        Cab cab = (source, destination) -> {
//            System.out.println("Lambda expression ");
//            System.out.println("Your ride is booked from "+source+" to "+destination);
//            return 100;
//        };
//        double fare = cab.bookCab("Mumbai", "Pune");
//        System.out.println("Total fare: "+fare);

    }
}


