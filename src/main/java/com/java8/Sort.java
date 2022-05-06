package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Sort {

  public static void main(String[] args) {
    List<Product> prod = createProduct();


  }

  public static List<Product> createProduct() {
    List<Product> productsList = new ArrayList<Product>();
    //Adding Products
    productsList.add(new Product(1, "HP Laptop", 25000));
    productsList.add(new Product(2, "Dell Laptop", 30000));
    productsList.add(new Product(3, "Lenevo Laptop", 28000));
    productsList.add(new Product(4, "Sony Laptop", 28000));
    productsList.add(new Product(5, "Apple Laptop", 90000));

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

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public double getPrice() {
      return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    @Override
    public String toString() {
      return "Product{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", price=" + price +
          '}';
    }
  }
}
