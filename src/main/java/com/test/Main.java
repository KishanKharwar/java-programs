package com.test;

public class Main {

  public static void main(String[] args) {
    Bike h = new Honda();
    System.out.println(h.speedLimit);
  }

  static class Bike{
    int speedLimit = 150;
  }

  static class Honda extends Bike{
    int speedLimit = 90;

  }
}




