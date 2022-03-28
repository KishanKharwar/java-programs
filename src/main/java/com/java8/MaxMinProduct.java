package com.java8;

import java.util.List;

public class MaxMinProduct {
    public static void main(String[] args) {
        List<Sort.Product> productList = Sort.createProduct();

        Sort.Product p = productList.stream().min((p1,p2) -> p1.getPrice()>p2.getPrice()?1:-1).get();
        System.out.println(p);
    }
}
