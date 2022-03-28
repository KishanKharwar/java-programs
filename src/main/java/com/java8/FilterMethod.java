package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Link : https://www.javatpoint.com/java-8-stream
 */
public class FilterMethod {
    public static void main(String[] args) {
        List<Product> productList = createProduct();
        //filterProduct(productList);
        //iterateUsingStreams();
        //iterateOverCollection(productList);
          sumOfCollection(productList);

    }

    private static void sumOfCollection(List<Product> productList) {
        //1 way
        double totalPrice = productList.stream().map(p -> p.price).reduce(0.0,(sum,price) -> sum + price);
        System.out.println(totalPrice);

        //2nd way
        double totalPrice2 = productList.stream().map(p -> p.price).reduce(0.0,Double::sum);
        System.out.println(totalPrice2);
    }

    private static void iterateOverCollection(List<Product> productList){
        productList.stream().filter(p-> p.price == 30000).forEach(p-> System.out.println(p.name));
    }

    private static void iterateUsingStreams(){
        Stream.iterate(1,i->i+1).filter(i->i%5==0).limit(5).forEach(System.out::println);
    }

    private static void filterProduct(List<Product> productsList){
        List<Double> priceList = productsList.stream().filter(p -> p.price<30000).map(p -> p.price).collect(Collectors.toList());
        System.out.println(priceList);
    }

    public static List<Product> createProduct(){
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000));
        productsList.add(new Product(2,"Dell Laptop",30000));
        productsList.add(new Product(3,"Lenevo Laptop",28000));
        productsList.add(new Product(4,"Sony Laptop",28000));
        productsList.add(new Product(5,"Apple Laptop",90000));

        return productsList;
    }
    static class Product {
        int id;
        String name;
        double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

    }
}
