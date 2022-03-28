package com.java8;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.*;

public class SumFromCollectors {
    public static void main(String[] args) {
        List<Sort.Product> productList = Sort.createProduct();

        double sumT = productList.stream().map(p -> p.price).reduce(0.0,(sum,price) -> sum + price);
        System.out.println(sumT);

        double sumTotal = productList.stream().collect(Collectors.summingDouble(p->p.getPrice()));
        System.out.println(sumTotal);

        double sumFinal = productList.stream().map(p->p.getPrice()).reduce(0.0,Double::sum);
        System.out.println(sumFinal);
    }


}
