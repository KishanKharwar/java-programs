package com.test.interview;

public class IntTest {

  public static void main(String[] args) {
    Bike bike = new Chile();
    System.out.println(bike.speed);
  }
}


class Bike {

  int speed = 90;
}

class Chile extends Bike {

  int speed = 150;
}
