package com.test.capgemeni;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DateExtraction {

  public static void main(String[] args) {
      LocalDate date = LocalDate.parse("2018-05-05");
      System.out.println(date);
      List<Order> orderList = getOrders();
      System.out.println("1 ----->"+orderList );
      orderList.stream().forEach( l -> LocalDate.parse(l.getDate()));

      System.out.println("2 ----->"+orderList);
//    String s = "Kishan Kumar Kharwar";
//    Map<String,Long> count = s.codePoints().mapToObj(c -> Character.toString((char) c)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//    System.out.println(count);
  }

  private static List<Order> getOrders(){
    Order o1 = new Order("O1","2022-01-02",23.45);
    Order o2 = new Order("O2","2022-01-01",21.45);
    Order o3 = new Order("O3","2022-01-03",22.45);
    Order o4 = new Order("O4","2022-01-04",24.45);
    Order o5 = new Order("O5","2022-01-05",25.45);
    Order o6 = new Order("O6","2022-01-06",26.45);
    Order o7 = new Order("O7","2022-01-07",27.45);
    Order o8 = new Order("O8","2022-01-08",28.45);
    Order o9 = new Order("O9","2022-01-09",29.45);
    Order o10 = new Order("O10","2022-01-10",230.45);

    List<Order> orderList = new ArrayList<>();
    orderList.add(o1);
    orderList.add(o2);
    orderList.add(o3);
    orderList.add(o4);
    orderList.add(o5);
    orderList.add(o6);
    orderList.add(o7);
    orderList.add(o8);
    orderList.add(o9);
    orderList.add(o10);

    return orderList;
  }


  static class Order {
    private String name;
    private String date;
    private Double price;

    public Order(String name, String date, Double price) {
      this.name = name;
      this.date = date;
      this.price = price;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public Double getPrice() {
      return price;
    }

    public void setPrice(Double price) {
      this.price = price;
    }

    @Override
    public String toString() {
      return "Order{" +
          "name='" + name + '\'' +
          ", date='" + date + '\'' +
          ", price=" + price +
          '}';
    }
  }
}
