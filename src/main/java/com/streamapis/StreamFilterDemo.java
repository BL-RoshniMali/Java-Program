package com.streamapis;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterDemo {

    private static List<Product> getProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Lenevo", 25000f));
        productList.add(new Product(2, "Dell", 20000f));
        productList.add(new Product(3, "HP", 35000f));
        productList.add(new Product(4, "Sony", 28000f));
        return productList;
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        for(Product product : getProducts()) {
            if(product.getPrice() > 25000f) {
                list.add(product);
            }
        }

        for (Product product : list) {
            System.out.println(product);
        }

        System.out.println("********************************************");

        // Using Stream API
//        getProducts().stream().filter((product -> product.getPrice()>25000f)).forEach(System.out::println);
//        filteredList.forEach(System.out::println);
        getProducts().stream().filter((product -> product.getPrice()>25000f)).forEach(System.out::println);
    }
}
